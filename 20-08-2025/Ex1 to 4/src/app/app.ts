import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';        
// import { UpperCasePipe } from '@angular/common';    
// import { DatePipe } from '@angular/common';
import { Ex4 } from './ex4/ex4';
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    RouterOutlet,
    FormsModule,    
    Ex4  
  ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  // enteredText: string = '';
  // selectedDate: string = '';
}
