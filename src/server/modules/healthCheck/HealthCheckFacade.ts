import pkg from "../../../../package.json";
import HealthCheckResponse from "./models/HealthCheckResponse";
export default class HealthCheckFacade {

  constructor(){
  }

  healthCheck(): HealthCheckResponse {
    return {
      status: "UP",
      appName: pkg.name,
      version: pkg.version,
      author: pkg.author,
    };
  }
}
