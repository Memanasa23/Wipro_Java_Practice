import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ex4',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './ex4.html',
  styleUrl: './ex4.css'
})
export class Ex4Component {
  flag1: boolean = true;     
  fontSize1: string = '20px';
  color1: string = 'green';

  toggleFlag() {
    this.flag1 = !this.flag1;
  }
}