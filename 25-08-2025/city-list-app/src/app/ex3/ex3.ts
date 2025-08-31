import { Component } from '@angular/core';
import { ReactiveFormsModule, FormControl } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ex3',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './ex3.html',
  styleUrl: './ex3.css'
})
export class Ex3 {
  inputControl = new FormControl('');
  reversedText: string = '';

  constructor() {
    this.inputControl.valueChanges.subscribe((value) => {
      this.reversedText = this.reverseString(value || '');
    });
  }

  reverseString(str: string): string {
    return str.split('').reverse().join('');
  }
}
