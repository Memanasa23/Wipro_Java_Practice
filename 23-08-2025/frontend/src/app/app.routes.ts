import { Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { FoodListComponent } from './food-list/food-list.component';
import { RegisterComponent } from './register/register.component';

export const routes: Routes = [
  { path: '', redirectTo: '/foods', pathMatch: 'full' },
  { path: 'foods', component: FoodListComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent }
];