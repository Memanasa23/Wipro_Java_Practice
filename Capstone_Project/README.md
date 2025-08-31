# Mini E-Commerce Application (Capstone Project)

https://drive.google.com/file/d/1ovMHh2MuKHqIZ4-m32sxd_C5eSkb5m63/view?usp=sharing (Click to see the demo of my project)

## Overview

This project is a **Mini E-Commerce Application** built as part of the Capstone Assessment using **Angular, Spring Boot, and MySQL**.

It demonstrates the implementation of a **microservices architecture** with role-based access control, enabling separate services for **User Management**, **Product Management**, and **Order Management**.

The application follows a **sprint-based agile methodology** and ensures scalability, modularity, and clean architecture.

---

## Problem Statement

Develop a mini e-commerce application where:

* **Admins** manage products (CRUD operations on the product catalog).
* **Customers** can register, browse products, add items to cart, and place/cancel orders.
* **Role-based access** ensures admins manage products while customers manage their own orders.

---

## Actors

* **Admin**

  * Add, update, delete products
  * Manage inventory

* **Customer**

  * Register and log in
  * Browse products and view details
  * Manage cart and place/cancel orders

---

## Core Features

### User Management

* Register and log in as a customer
* Profile update and management
* Role-based access control

### Product Management (Admin only)

* Add new products with details (name, description, price, quantity)
* Update existing products
* Delete products
* View product catalog

### Order Management

* Add products to cart
* Update or remove items from cart
* Place new orders
* Cancel orders (with automatic stock update)
* View order history

---

## Tech Stack

* **Frontend:** Angular, HTML, CSS, Bootstrap
* **Backend:** Spring Boot (Java 17/21)
* **Database:** MySQL
* **API Documentation:** Swagger
* **Architecture:** Microservices (User MS, Product MS, Order MS)
* **Optional Integration:** Kafka for async communication

---

## System Architecture

* **User Management Microservice**
* **Product Management Microservice**
* **Order Management Microservice**

Each service is independent, follows layered architecture (`Controller → Service → Repository → Entity`), and exposes REST APIs.

---

## API Endpoints (Sample)

### User Service

* `POST /user` → Create User
* `PUT /user` → Update User
* `DELETE /user` → Delete User
* `GET /user` → Get All Users
* `GET /user/{id}` → Get User by ID
* `POST /user/login` → User Login

### Product Service

* `POST /product` → Create Product
* `PUT /product` → Update Product
* `DELETE /product` → Delete Product
* `GET /product` → List All Products
* `GET /product/{id}` → Get Product Details

### Order Service

* `POST /cart/addProd` → Add Product to Cart
* `PUT /cart/update` → Update Cart Item Quantity
* `DELETE /cart/deleteProd/{id}` → Remove Cart Item
* `POST /order` → Place Order
* `PUT /order/{id}` → Cancel Order
* `GET /order/{userId}` → View Orders by User

---

## UI/UX Guidelines

* Simple, intuitive, and responsive design
* Consistent color schemes, fonts, and components
* Clear messages and feedback for user interactions
* Angular Routing for navigation between modules

