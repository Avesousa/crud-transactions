import HealthCheckModule from '../modules/healthCheck/HealthCheckModule';
import AuthenticationModule from './authentication/AuthenticationModule';

export class Endpoint {
    public static auth: string = '/auth';
    public static healthCheck: string = '/health-check';
}

export default [
    HealthCheckModule,
    AuthenticationModule
];