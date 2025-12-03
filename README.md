# 🛒 ShoppingCart – Spring Boot Backend

A fully-featured shopping cart backend built for hands-on Spring Boot practice.  
Includes Products, Categories, Cart, Orders, Users, JWT Security, and clean layered architecture.

## 🚀 Tech Stack

- **Java** (Spring Boot)
- **Spring Data JPA**
- **Spring Security + JWT**
- **MySQL**
- **Maven**
- **Lombok**
- **ModelMapper**
- **RESTful API Design**

## 📦 Features

### 1. Product Management
- Create, Read, Update, Delete products
- Product → Category mapping
- Product image upload support
- Pagination & sorting support
- DTO-based API responses

### 2. Category Management
- CRUD for categories
- Category → Product relationships
- Clean DTO transformation

### 3. Cart & Cart Items
- Add item to cart
- Remove item from cart
- Update quantity
- Auto-recalculate total cart price
- Separate controllers for Cart & CartItems

### 4. Orders
- Create orders from cart
- OrderItems mapping
- Calculate total price, quantity
- Order DTO for clean API data
- User → Orders relationship

### 5. User Management
- Create user
- Fetch profile
- Role-based Authorization
- Users linked to Orders and Cart

### 6. Authentication & Security
- Spring Security setup from scratch
- Custom UserDetailsService
- Password encoding
- JWT Authentication + Authorization
- Login endpoint returning JWT
- Secured endpoints for cart/order operations
- Role-based access

## 🧱 Project Structure
'''src/
└── main/
├── java/
│ └── com.example.shoppingcart/
│ ├── controller/
│ ├── service/
│ ├── repository/
│ ├── entity/
│ ├── dto/
│ ├── security/
│ ├── exception/
│ └── config/
└── resources/
├── application.properties
└── static/images/'''
