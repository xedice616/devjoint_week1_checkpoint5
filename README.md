# Library Management System

A RESTful Library Management System built with Spring Boot.

## Technologies

- Java 17
- Spring Boot 3.5.3
- Spring Data JPA
- PostgreSQL
- Lombok
- MapStruct
- Swagger / OpenAPI

## Features

- Author Management (CRUD)
- Book Management (CRUD)
- Member Management (CRUD)
- Loan Management (CRUD)
- Pagination and Sorting
- DTO Mapping with MapStruct
- Input Validation
- Global Exception Handling
- Swagger API Documentation

## Validation

The project uses Jakarta Validation annotations such as:

- @NotBlank
- @NotNull
- @Email
- @Size
- @Min

## Exception Handling

Implemented centralized exception handling using:

- @ControllerAdvice
- @ExceptionHandler
- ResourceNotFoundException

## API Documentation

After running the application, Swagger UI is available at:

```
http://localhost:8080/swagger-ui/index.html
```

## Run the Project

1. Clone the repository.
2. Configure PostgreSQL database.
3. Update the database credentials in `application.yaml`.
4. Run the application.
5. Open Swagger UI to test the endpoints.

## Author
ahmedova_k