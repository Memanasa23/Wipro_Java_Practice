import { Component } from '@angular/core';
import { MovieService } from '../movie/movie.service';
import { Moviemodel } from '../movie/movie.model';

@Component({
  selector: 'app-movie',
  imports: [],
  templateUrl: './movie.html',
  styleUrl: './movie.css'
})
export class Movie {

  movies: Moviemodel[] = [];
  newMovie: Moviemodel = { movieId: 0, movieName: '', language: '', imdbRating: 0 };
  editMode = false;
  editId: number | null = null;

  constructor(private movieService: MovieService) {
    this.loadMovies();
  }

  loadMovies() {
    this.movies = this.movieService.getMovies();
  }

  addMovie() {
    if (!this.editMode) {
      this.movieService.addMovie({ ...this.newMovie });
    } else {
      this.movieService.updateMovie(this.editId!, { ...this.newMovie });
      this.editMode = false;
      this.editId = null;
    }
    this.newMovie = { movieId: 0, movieName: '', language: '', imdbRating: 0 };
    this.loadMovies();
  }

  editMovie(movie: Moviemodel) {
    this.newMovie = { ...movie };
    this.editMode = true;
    this.editId = movie.movieId;
  }

  deleteMovie(id: number) {
    this.movieService.deleteMovie(id);
    this.loadMovies();
  }

}
