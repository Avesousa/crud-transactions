import { NgbDate } from '@ng-bootstrap/ng-bootstrap';
import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filterDate'
})
export class FilterDatePipe implements PipeTransform {

  transform(values: any[], keys: string, startDate_: NgbDate | null, endDate_: NgbDate | null): any {
    if(startDate_ && endDate_ ){
      const startDate = new Date(startDate_.year, startDate_.month - 1, startDate_.day);
      const endDate = new Date(endDate_.year, endDate_.month - 1, endDate_.day);
      return (values || [])
      .filter( value => keys.split(',')
          .some((key) => {
            let params = key.split('.');
            let prop = value;
            for(let param of params){
              if(prop.hasOwnProperty(param)){
                prop = prop[param];
              }
            }
            let date = new Date(prop);
            return date >= startDate &&  date <= endDate;
          }));
    }else {
      return values;
    }
  }

}
