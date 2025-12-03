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
```
src/
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
└── static/images/
```

## 🧪 API Testing

The project includes full testing of:
- Product APIs
- Category APIs
- Cart & CartItem APIs
- User APIs
- Order APIs
- Authentication (JWT)
- Error handling checks
- Edge case validation

**Tools used:**
- Postman
- MySQL Workbench

## 🔐 Authentication Flow

1. Register a user
2. Login → receive JWT
3. Attach JWT in Header:
```Authorization: Bearer <token>```
4. Access protected routes:
- `/api/cart/**`
- `/api/orders/**`
- `/api/users/**`

## 🧭 How to Run

1. Clone the repo
2. Configure `application.properties` for MySQL
3. Run the project
4. Use Postman to test APIs
5. Add your JWT in headers after logging in

## 📁 Future Enhancements (Optional)

- Product search + filters
- Global exception response format
- Swagger documentation
- Role-based user dashboards
- Email notifications for orders

## 🙌 Acknowledgement

This project was built as part of personal Spring Boot backend practice — covering entities, services, DTOs, controllers, authentication, and real-world e-commerce backend flows.

---

**⭐ If you found this project helpful, consider giving it a star!**


