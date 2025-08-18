import { Component } from '@angular/core';

@Component({
  selector: 'app-welcome',
  standalone: true,   
  imports: [],

  template: `
    <div class="container text-center mt-5">
      <h2 class="text-primary">Welcome Works!</h2>
      <p>This is an inline template without using templateUrl</p>
      <button class="btn btn-success">Click Me</button>
    </div>
  `,
  styleUrls: ['./welcome.css']   
})
export class Welcome {}
