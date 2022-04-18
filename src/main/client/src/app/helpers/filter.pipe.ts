import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name : 'filterPipe',
})
export class FilterPipe implements PipeTransform {
  public transform(value: any[], keys: string, term: string) {
    if (!term) return value;
    return (value || [])
      .filter(item => keys.split(',').some((key) => {
          let params = key.split('.');
          let prop = item;
          for(let param of params){
            if(prop.hasOwnProperty(param)){
              prop = prop[param];
            }
          }
          return prop && new RegExp(term, 'gi').test(prop)
      }))
  }
}
