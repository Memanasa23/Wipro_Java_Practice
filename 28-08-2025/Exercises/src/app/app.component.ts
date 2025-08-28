import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Exercises';
  result: boolean | null = null;

  isPalindrome(str: string): boolean {
    if (!str) return false;
    return str === str.split('').reverse().join('');
  }
}
