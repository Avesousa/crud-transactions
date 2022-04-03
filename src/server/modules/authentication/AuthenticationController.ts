import { Request, Response, Router } from "express";
import { Endpoint } from "..";
import { AuthenticationFacade } from "./AuthenticationFacade";
import Jwt from "../../helpers/Jwt";

export default class AuthenticationController{

    private facade: AuthenticationFacade;
    
    constructor(router: Router){
        this.facade = new AuthenticationFacade();
        this.configureRoutes(router);
    }

     configureRoutes(router: Router): void { 
        const routeMain = Router();
        const routes = Router();
        
        routes.get('/login', this.login.bind(this));
        routes.get('/verify/:token', this.verify.bind(this));

        router.use(routeMain.use(Endpoint.auth, routes));
        console.info(`endpoint run... ${Endpoint.auth}`);
     }

     public login(_req: Request, res: Response): void {
        res.send(`Login ok! with token: ${Jwt.create({login:"ok token"})}`);
     }

     public verify(req: Request, res: Response): void {
        
        res.send(`token correct: ${JSON.stringify(Jwt.getData(req.params.token))}`);
    }

     
}