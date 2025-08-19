import { Component, signal } from '@angular/core';
// EX1
// import { RouterOutlet } from '@angular/router';
// import { Home } from './home/home';

// Ex2
// import { NgClass } from '@angular/common';
// import { Ex3 } from './ex3/ex3';
// import { Ex4Component } from './ex4/ex4';
import { Home } from './home/home';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [Home],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('Ex1');
  flag1 = true;
  flag2 = false;

  toggleFlags() {
    this.flag1 = !this.flag1;
    this.flag2 = !this.flag2;
  }
}
