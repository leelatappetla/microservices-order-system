# Microservices Order System

A Spring Boot microservices-based system with separate product and order services behind an API gateway.

---

## Architecture

- **Product Service** → Handles product catalog  
- **Order Service** → Handles order processing  
- **API Gateway** → Entry point for all client requests  

Each service runs independently and communicates via REST APIs.

---

## How to Run

Run each service separately:

```bash
cd product-service
mvn spring-boot:run

cd order-service
mvn spring-boot:run

cd api-gateway
mvn spring-boot:run
