import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-colors',
  imports: [FormsModule, CommonModule],
  templateUrl: './colors.html',
  styleUrl: './colors.css'
})
export class Colors {
  color: string = 'default';
}
