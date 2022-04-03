import { Router } from "express";
import AuthenticationController from "./AuthenticationController";

export default class AuthenticationModule {
    private controller: AuthenticationController;

    constructor(router: Router){
        this.controller = new AuthenticationController(router);
    }
}