import { UserRegister } from './../models/userRegister';
import { UserLogin } from './../models/userLogin';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';
import { Jwt } from '../models/jwt';

const server: string = environment.server;
const endpoint: string = `${server}/auth`;

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) {}

  private getHeader = () => {
    return {
      headers: new HttpHeaders({ 'content-Type': 'application/json'})
    }
  }

  login(user: UserLogin): Observable<Jwt>{
    return this.http.post<Jwt>(`${endpoint}/login`, user);
  }

  register(user: UserRegister): Observable<UserRegister>{
    return this.http.post<UserRegister>(`${endpoint}/register`,user);
  }

}
