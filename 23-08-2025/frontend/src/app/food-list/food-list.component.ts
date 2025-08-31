// import { Component } from '@angular/core';

// @Component({
//   selector: 'app-food-list',
//   standalone: true,
//   imports: [],
//   templateUrl: './food-list.component.html',
//   styleUrl: './food-list.component.css'
// })
// export class FoodListComponent {

// }
import { Component, OnInit } from '@angular/core';
import { Food } from '../food';
import { FoodService } from '../food.service';
import { OrderService } from '../order.service';
import { AuthService } from '../auth.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-food-list',
  standalone: true,
  templateUrl: './food-list.component.html',
  styleUrls: ['./food-list.component.css'],
  imports: [CommonModule, FormsModule] 
})

export class FoodListComponent implements OnInit {
  foods: Food[] = [];
  filteredFoods: Food[] = [];
  categories: string[] = [];
  loading = true;
  searchQuery = '';
  selectedCategory = '';
  cartItemsCount = 0;

  constructor(
    private foodService: FoodService,
    private orderService: OrderService,
    public authService: AuthService
  ) {}

  ngOnInit(): void {
    this.loadFoods();
    this.loadCategories();
    this.orderService.cartItems$.subscribe(items => {
      this.cartItemsCount = this.orderService.getCartItemsCount();
    });
  }

  loadFoods(): void {
    this.foodService.getAllFoods().subscribe({
      next: (foods) => {
        this.foods = foods;
        this.filteredFoods = foods;
        this.loading = false;
      },
      error: (error) => {
        console.error('Error loading foods:', error);
        this.loading = false;
      }
    });
  }

  loadCategories(): void {
    this.foodService.getCategories().subscribe({
      next: (categories) => {
        this.categories = categories;
      },
      error: (error) => {
        console.error('Error loading categories:', error);
      }
    });
  }

  addToCart(food: Food): void {
    if (!this.authService.isLoggedIn()) {
      alert('Please login to add items to cart');
      return;
    }
    this.orderService.addToCart(food);
    alert(`${food.name} added to cart!`);
  }

  searchFoods(): void {
    this.filterFoods();
  }

  filterByCategory(): void {
    this.filterFoods();
  }

  private filterFoods(): void {
    this.filteredFoods = this.foods.filter(food => {
      const matchesSearch = !this.searchQuery || 
        food.name.toLowerCase().includes(this.searchQuery.toLowerCase()) ||
        food.description.toLowerCase().includes(this.searchQuery.toLowerCase());
      
      const matchesCategory = !this.selectedCategory || food.category === this.selectedCategory;
      
      return matchesSearch && matchesCategory;
    });
  }

  clearFilters(): void {
    this.searchQuery = '';
    this.selectedCategory = '';
    this.filteredFoods = this.foods;
  }
}