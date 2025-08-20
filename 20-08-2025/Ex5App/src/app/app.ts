import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Movie } from './movie/movie';
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, Movie],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('Ex5App');
}
