import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { tap } from 'rxjs/operators';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private apiUrl = 'http://localhost:8080/api';
  private currentUserSubject = new BehaviorSubject<User | null>(null);
  public currentUser$ = this.currentUserSubject.asObservable();

  constructor(private http: HttpClient) {
    // Check if user is already logged in
    const token = localStorage.getItem('token');
    if (token) {
      this.getCurrentUserInfo().subscribe({
        next: (user) => this.currentUserSubject.next(user),
        error: () => this.logout()
      });
    }
  }

  login(email: string, password: string): Observable<any> {
    return this.http.post(`${this.apiUrl}/user/login`, { email, password })
      .pipe(
        tap((response: any) => {
          if (response.token) {
            localStorage.setItem('token', response.token);
            this.currentUserSubject.next(response.user);
          }
        })
      );
  }

  register(userData: any): Observable<User> {
    return this.http.post<User>(`${this.apiUrl}/user/register`, userData);
  }

  logout(): void {
    localStorage.removeItem('token');
    this.currentUserSubject.next(null);
  }

  isLoggedIn(): boolean {
    return !!localStorage.getItem('token');
  }

  getCurrentUser(): User | null {
    return this.currentUserSubject.value;
  }

  private getCurrentUserInfo(): Observable<User> {
    const headers = this.getAuthHeaders();
    return this.http.get<User>(`${this.apiUrl}/user/profile`, { headers });
  }

  getAuthHeaders(): HttpHeaders {
    const token = localStorage.getItem('token');
    return new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': token ? `Bearer ${token}` : ''
    });
  }
}