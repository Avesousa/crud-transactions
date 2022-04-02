export interface ConfigModel {
    portMain: string;
    basePath: string;
    env: string;
    currencyAccessKey?: string;
    currencyPath?: string;
    database: {
        host: string,
        user: string,
        password: string,
        database: string
    }
}
