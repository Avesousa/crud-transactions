import * as path from 'path';
export default function config() {
    return {
        portMain: process.env.APP_PORT || '3000',
        basePath: process.env.APP_PATH || 'localhost',
        env: process.env.NODE_ENV || 'NULL',
        database: {
            host: process.env.DB_HOST || "mysql_server",
            user: process.env.DB_USER || "root",
            password: process.env.DB_PASSWORD || "secret123",
            database: process.env.DB_DATABASE || "beerChallenge"
        }
    }  
};
