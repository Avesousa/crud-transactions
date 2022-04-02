import express, { Application, Router, Request } from 'express';
import path from 'path';
import cors from "cors";
import morgan from 'morgan';
import config from "./helpers/config";
import modules from "./modules";
import { ConfigModel } from './helpers/models/configModel';
import generateRequestId from './middlewares/generateRequestId';

morgan.token('id', (req: Request) => {
    return req.id;
});

export default class App {
    private expressApp: Application;
    private router: Router;
    private morganFormat: string;
    private config: ConfigModel;

    constructor() {
        this.expressApp = express();
        this.router = Router();
        this.morganFormat = ":date[iso] [:method] [:response-time ms] request_id :id [:status] [:response-time] [:url]";
        this.config = config();
        this.configExpress();
    }

    private configExpress(): void {
        this.expressApp.use(cors());
        this.expressApp.use(express.json());
        this.expressApp.use(express.urlencoded({ extended: true }));
        this.expressApp.use(morgan(this.morganFormat));
        this.expressApp.use(generateRequestId);
        this.createModule();
    }
    private createModule(): void {
        modules.forEach((module) => new module(this.router));
        this.expressApp.use('/public',express.static(path.join(__dirname,'..','..','dist')));
        this.expressApp.get('/web',(_req, res) => res.sendFile(path.join(__dirname,'..','public','index.html')));
        this.expressApp.use('/api',this.router);
    }

    private showServerConnection(): void {
        console.info(
            `Runing expressApp on port ${this.config.portMain} in http://${this.config.basePath}:${this.config.portMain}`
        );
        console.info(
            `Health Check on http://${this.config.basePath}:${this.config.portMain}/api/health-check`
        );
    }

    public run(): void {
        this.expressApp.listen(this.config.portMain, () => {
            this.showServerConnection();
        }).on('error', (err:any)=> {
            if(err.code === 'EADDRINUSE'){
                console.warn(`Port ${this.config.portMain} is used...`);
                this.config.portMain = (parseInt(this.config.portMain)+1).toString();
                this.run();
            }
        });
    }
}
