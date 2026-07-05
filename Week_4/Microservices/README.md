# Week 4 – Microservices Exercises

This directory contains all Microservices hands-on exercises completed during Week 4.

## Exercises

### Exercise 1 – Account and Loan Microservices

Created two independent Spring Boot REST microservices:

- **Account Service**
  - GET `/accounts/{number}`
  - Returns dummy account details

- **Loan Service**
  - GET `/loans/{number}`
  - Returns dummy loan details

### Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Maven
- REST APIs

Both services run independently on different ports:

- Account Service → **8080**
- Loan Service → **8081**