import express, { Application, Router, Request } from "express";
import path from "path";
import cors from "cors";
import morgan from "morgan";
import config from "./helpers/config";
import modules from "./modules";
import { ConfigModel } from "./helpers/models/configModel";
import generateRequestId from "./middlewares/generateRequestId";

morgan.token("id", (req: Request) => {
  return req.id;
});

export default class App {
  private expressApp: Application;
  private router: Router;
  private morganFormat: string;
  private config: ConfigModel;
//   private compiler: Compiler;

  constructor() {
    // this.compiler = webpack(webpackConfig);
    this.expressApp = express();
    this.router = Router();
    this.morganFormat =
      ":date[iso] [:method] [:response-time ms] request_id :id [:status] [:response-time] [:url]";
    this.config = config();
    this.configExpress();
  }

  private configExpress(): void {
    this.expressApp.use(cors());
    this.expressApp.use(express.json());
    this.expressApp.use(express.urlencoded({ extended: true }));
    this.expressApp.use(morgan(this.morganFormat));
    this.expressApp.use(generateRequestId);
    this.createRoutes();
  }
  private createRoutes(): void {
    modules.forEach((module) => new module(this.router));
    this.router.use
    this.expressApp.use("/api", this.router);
    this.addStatics();
  }

  private showServerConnection(): void {
    console.info(
      `Runing expressApp on port ${this.config.portMain} in http://${this.config.basePath}:${this.config.portMain}`
    );
  }

  private addStatics(){
    const folderDist = path.join(__dirname, "..", "..", "dist");
    this.expressApp.use("/public", express.static(folderDist));
    this.expressApp.get("/", (_, res) => res.sendFile(path.join(folderDist, "index.html")));
  }

  public run(): void {
    this.expressApp
      .listen(this.config.portMain, () => {
        this.showServerConnection();
      })
      .on("error", (err: any) => {
        if (err.code === "EADDRINUSE") {
          console.warn(
            `Port ${this.config.portMain} is used... trying with ${
              parseInt(this.config.portMain) + 1
            }`
          );
          this.config.portMain = (
            parseInt(this.config.portMain) + 1
          ).toString();
          this.run();
        }
      });
  }
}
