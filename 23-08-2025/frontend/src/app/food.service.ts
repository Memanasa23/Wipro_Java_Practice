import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Food } from './food';
import { AuthService } from './auth.service';

@Injectable({
  providedIn: 'root'
})
export class FoodService {
  private apiUrl = 'http://localhost:8080/api/food';

  constructor(
    private http: HttpClient,
    private authService: AuthService
  ) {}

  getAllFoods(): Observable<Food[]> {
    return this.http.get<Food[]>(`${this.apiUrl}/all`);
  }

  getFoodById(id: number): Observable<Food> {
    return this.http.get<Food>(`${this.apiUrl}/${id}`);
  }

  getFoodsByCategory(category: string): Observable<Food[]> {
    return this.http.get<Food[]>(`${this.apiUrl}/category/${category}`);
  }

  searchFoods(query: string): Observable<Food[]> {
    return this.http.get<Food[]>(`${this.apiUrl}/search?q=${query}`);
  }

  getCategories(): Observable<string[]> {
    return this.http.get<string[]>(`${this.apiUrl}/categories`);
  }
}
