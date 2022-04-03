import { Request, Response, NextFunction, Router } from 'express';
import { Endpoint } from '..';
import HealthCheckFacade from './HealthCheckFacade';

export default class HealthCheckController{
    private facade: HealthCheckFacade = new HealthCheckFacade();

    constructor(router: Router){
        this.configRoutes(router);
    }

    private configRoutes(router: Router): void {
        const routeMain = Router();
        const routes = Router();

        routes.get('/', this.healthCheck.bind(this));

        router.use(routeMain.use(Endpoint.healthCheck, routes));
        console.info(`endpoint run... ${Endpoint.healthCheck}`);
    }

    public healthCheck(_req: Request, res: Response): void {
        res.send(this.facade.healthCheck());
    }
}
