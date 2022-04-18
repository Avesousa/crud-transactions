import { NgbDate, NgbCalendar, NgbDateParserFormatter } from '@ng-bootstrap/ng-bootstrap';
import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'Filter',
  templateUrl: './filter.component.html',
  styleUrls: ['./filter.component.scss']
})
export class FilterComponent implements OnInit {

  @Output() filterEvent = new EventEmitter<string>();
  @Output() fromDateEvent = new EventEmitter<NgbDate | null>();
  @Output() toDateEvent = new EventEmitter<NgbDate | null>();

  filter: string | '' = '';

  ngOnInit(): void {
  }

  setFilter(){
    this.filterEvent.emit(this.filter);
  }
  setFromDate(date: NgbDate | null){
    this.fromDateEvent.emit(date);
  }
  setToDate(date: NgbDate | null){
    this.toDateEvent.emit(date);
  }

}
