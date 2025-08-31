import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './login.html',
  styleUrls: ['./login.css']
})
export class Login {
  userId: string = '';
  password: string = '';

  onLogin() {
    console.log('UserId:', this.userId, 'Password:', this.password);
    alert(`Welcome, ${this.userId}!`);
  }

  onLogout() {
    this.userId = '';
    this.password = '';
    alert('Logged out successfully!');
  }
}
