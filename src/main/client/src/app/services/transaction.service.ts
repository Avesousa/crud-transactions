import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable, PipeTransform } from "@angular/core";
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import Transaction from '../models/transaction';
import TypeClient from '../models/typeClient';
import TypeTransaction from '../models/typeTransaction';

const server: string = environment.server;
const endpoint: string = `${server}/transaction`;

@Injectable({
  providedIn: 'root'
})
export class TransactionService{

  constructor(private http: HttpClient) {}

  private getHeader = () => {
    return {
      headers: new HttpHeaders({ 'content-Type': 'application/json'})
    }
  }

  getTransactions(): Observable<Transaction[]> {
    return this.http.get<Transaction[]>(endpoint);
  }

}
