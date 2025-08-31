import { Component, EventEmitter, Input, Output } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IFruit } from '../ex5fruit/ex5fruit.interface';

@Component({
  selector: 'app-fruit',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './ex5fruit.html',
  styleUrl: './ex5fruit.css'
})
export class Ex5fruit {

  @Input() fruit!: IFruit;
  @Output() btnClick = new EventEmitter<string>();

  onClick(fruitName: string) {
    console.log("Clicked-" + fruitName);
    this.btnClick.emit(fruitName);
  }

  // @Input() fruit: any; 
  // @Input() fruit!: IFruit;

}
