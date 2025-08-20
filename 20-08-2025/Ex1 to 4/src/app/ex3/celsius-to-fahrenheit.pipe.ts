import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'cToF',
  standalone: true
})
export class CelsiusToFahrenheitPipe implements PipeTransform {
  transform(value: number | string): string {
    if (value === null || value === undefined || value === '') {
      return '';
    }
    const celsius = Number(value);
    const fahrenheit = (celsius * 9/5) + 32;
    return `${fahrenheit}F`;
  }
}
