# Week 3 - Spring REST

This folder contains the Spring REST hands-on exercises completed as part of the Cognizant Digital Nurture 5.0 Java FSE program.

## Exercises

### Exercise 1 - Create Spring Project
- Created a Spring Boot project using Spring Initializr.
- Added Spring Web and Spring Boot DevTools.
- Verified successful application startup.

**Technologies**
- Spring Boot
- Maven
- Java 17

---

### Exercise 2 - Load Country from XML
- Created `country.xml` Spring configuration.
- Loaded Country bean using `ClassPathXmlApplicationContext`.
- Displayed country details using Spring Core.

**Concepts Covered**
- Spring IoC
- Bean Configuration
- XML Configuration
- ApplicationContext

---

### Exercise 3 - Hello World REST Service
- Implemented first REST endpoint.

**Endpoint**

GET `/hello`

**Response**

```
Hello World!!
```

**Concepts Covered**
- REST Controller
- @GetMapping
- Logging

---

### Exercise 4 - Country REST Service
- Created REST service to return India details from Spring XML configuration.

**Endpoint**

GET `/country`

**Sample Response**

```json
{
  "code": "IN",
  "name": "India"
}
```

**Concepts Covered**
- REST API
- Bean Loading
- JSON Response

---

### Exercise 5 - Get Country by Code
- Implemented REST service to return country details based on country code.
- Case-insensitive search implemented.

**Endpoint**

GET `/countries/{code}`

**Example**

```
GET /countries/in
```

**Response**

```json
{
  "code": "IN",
  "name": "India"
}
```

**Concepts Covered**
- Path Variables
- REST APIs
- Service Layer
- XML Bean Configuration

---

### Exercise 6 - JWT Authentication
- Implemented authentication endpoint.
- Generated JWT token after successful authentication.
- Configured Spring Security.

**Endpoint**

GET `/authenticate`

**Authentication**

Basic Authentication

Example:

```
Username : user
Password : pwd
```

**Response**

```json
{
  "token":"<JWT Token>"
}
```

**Concepts Covered**
- Spring Security
- Basic Authentication
- JWT Token Generation

---

## Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Spring Security
- Maven
- SLF4J Logging
- JWT (JJWT)
- VS Code

---

## Author

Nakshatra Jain