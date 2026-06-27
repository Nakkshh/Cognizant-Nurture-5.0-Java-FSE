# Exercise 6 - JWT Authentication

Run

```bash
mvn spring-boot:run
```

Request

```bash
curl -u user:pwd http://localhost:8090/authenticate
```

Response

```json
{
  "token":"<jwt-token>"
}
```