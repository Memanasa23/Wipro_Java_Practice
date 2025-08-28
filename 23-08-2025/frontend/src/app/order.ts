export interface Order {
  id: number;
  userId: number;
  items: OrderItem[];
  totalAmount: number;
  status: string;
  createdAt: Date;
  deliveryAddress: string;
  paymentStatus?: string;
}

export interface OrderItem {
  id: number;
  foodId: number;
  foodName: string;
  quantity: number;
  price: number;
  totalPrice: number;
}