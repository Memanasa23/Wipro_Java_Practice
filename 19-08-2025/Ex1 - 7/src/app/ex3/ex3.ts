import { Component } from '@angular/core';
import { NgClass } from '@angular/common';

@Component({
  selector: 'app-ex3',
  standalone: true,
  imports: [NgClass],
  templateUrl: './ex3.html',
  styleUrl: './ex3.css'
})
export class Ex3 {

  flag1 = true;
  flag2 = false;

  toggleFlags() {
    this.flag1 = !this.flag1;
    this.flag2 = !this.flag2;
  }

  getNgClass() {
    return {
      'app1': this.flag1,
      'app2': this.flag2
    };
  }

}
