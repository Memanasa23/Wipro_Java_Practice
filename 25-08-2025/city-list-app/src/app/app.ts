import { Component, signal } from '@angular/core';
// import { RouterOutlet } from '@angular/router';
import { MatListModule } from '@angular/material/list';
// import { Ex2 } from './ex2/ex2';
// import { Ex3 } from './ex3/ex3';
// import { Ex4Component } from './ex4/ex4';
import { Ex5 } from './ex5/ex5';

@Component({
  selector: 'app-root',
  standalone:true,
  imports: [MatListModule, Ex5],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('city-list-app');
  // cities = signal(['Lucknow', 'Delhi', 'Mumbai', 'Chennai', 'Kolkata', 'Bengaluru']);
}
