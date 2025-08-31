import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { Order, OrderItem } from './order';
import { Food } from './food';
import { AuthService } from './auth.service';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  private apiUrl = 'http://localhost:8080/api';
  private cartItems = new BehaviorSubject<OrderItem[]>([]);
  public cartItems$ = this.cartItems.asObservable();

  constructor(
    private http: HttpClient,
    private authService: AuthService
  ) {}

  // Cart Management
  addToCart(food: Food, quantity: number = 1): void {
    const currentItems = this.cartItems.value;
    const existingItem = currentItems.find(item => item.foodId === food.id);

    if (existingItem) {
      existingItem.quantity += quantity;
      existingItem.totalPrice = existingItem.quantity * existingItem.price;
    } else {
      const newItem: OrderItem = {
        id: 0,
        foodId: food.id,
        foodName: food.name,
        quantity: quantity,
        price: food.price,
        totalPrice: food.price * quantity
      };
      currentItems.push(newItem);
    }

    this.cartItems.next([...currentItems]);
  }

  removeFromCart(foodId: number): void {
    const currentItems = this.cartItems.value;
    const updatedItems = currentItems.filter(item => item.foodId !== foodId);
    this.cartItems.next(updatedItems);
  }

  updateQuantity(foodId: number, quantity: number): void {
    const currentItems = this.cartItems.value;
    const item = currentItems.find(item => item.foodId === foodId);
    if (item && quantity > 0) {
      item.quantity = quantity;
      item.totalPrice = item.quantity * item.price;
      this.cartItems.next([...currentItems]);
    }
  }

  clearCart(): void {
    this.cartItems.next([]);
  }

  getTotalAmount(): number {
    return this.cartItems.value.reduce((total, item) => total + item.totalPrice, 0);
  }

  getCartItemsCount(): number {
    return this.cartItems.value.reduce((count, item) => count + item.quantity, 0);
  }

  // Order Management
  createOrder(orderData: any): Observable<Order> {
    const headers = this.authService.getAuthHeaders();
    return this.http.post<Order>(`${this.apiUrl}/order/create`, orderData, { headers });
  }

  getUserOrders(): Observable<Order[]> {
    const headers = this.authService.getAuthHeaders();
    return this.http.get<Order[]>(`${this.apiUrl}/order/user`, { headers });
  }

  getOrderById(id: number): Observable<Order> {
    const headers = this.authService.getAuthHeaders();
    return this.http.get<Order>(`${this.apiUrl}/order/${id}`, { headers });
  }

  updateOrderStatus(orderId: number, status: string): Observable<Order> {
    const headers = this.authService.getAuthHeaders();
    return this.http.put<Order>(`${this.apiUrl}/order/${orderId}/status`, { status }, { headers });
  }
}