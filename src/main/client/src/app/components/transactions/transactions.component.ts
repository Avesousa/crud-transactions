import { Component, OnInit, QueryList, ViewChild, ViewChildren } from '@angular/core';
import { NgbCalendar, NgbDate, NgbDateParserFormatter } from '@ng-bootstrap/ng-bootstrap';
import Transaction from 'src/app/models/transaction';
import { TransactionService } from 'src/app/services/transaction.service';

@Component({
  selector: 'Transactions',
  templateUrl: './transactions.component.html',
  styleUrls: ['./transactions.component.scss'],
})
export class TransactionsComponent implements OnInit {
  transactions: Transaction[] = [];
  filter: string= "";
  fromDate: NgbDate | null = null;
  toDate: NgbDate | null = null;

  constructor(private service: TransactionService) {
    this.service.getTransactions().subscribe(
      (transactions) => {
        this.transactions = transactions;
        console.log(transactions);
      },
      (error) => {
        console.log(error.message);
      });
  }

  setFilter(filter: string){
    this.filter = filter;
  }
  setFromDate(date: NgbDate | null){
    this.fromDate = date;
    console.log(date);
  }
  setToDate(date: NgbDate | null){
    this.toDate = date;
    console.log(date);
  }

  ngOnInit(): void {

  }

}
