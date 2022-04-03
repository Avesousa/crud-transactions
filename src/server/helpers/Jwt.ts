import * as jwt from 'jsonwebtoken';

export default class Jwt {
    private static secretKey: string = 'jkL0p1540';

    public static create(data: any): string {
        const expiresIn: number = 24*24*60;
        return jwt.sign(data, this.secretKey, { expiresIn });
    }

    public static getData(token: string): any {
        return jwt.verify(token, this.secretKey);
    }

    public static 

}