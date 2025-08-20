import { Injectable } from '@angular/core';
import { Moviemodel } from './movie.model';

@Injectable({
  providedIn: 'root'
})
export class MovieService {
  private movies: Moviemodel[] = [];

  getMovies(): Moviemodel[] {
    return this.movies;
  }

  addMovie(movie: Moviemodel): void {
    this.movies.push(movie);
  }

  updateMovie(movieId: number, updatedMovie: Moviemodel): void {
    const index = this.movies.findIndex(m => m.movieId === movieId);
    if (index !== -1) {
      this.movies[index] = updatedMovie;
    }
  }

  deleteMovie(movieId: number): void {
    this.movies = this.movies.filter(m => m.movieId !== movieId);
  }
}
