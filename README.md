# Supplier Management API

## Overview

The Supplier Management API is a Spring Boot application designed for managing suppliers efficiently. This API allows users to add, query, and manage supplier information while providing clear documentations and validations through Swagger and structured endpoints.

## Table of Contents

- [Features](#features)
- [Technology Stack](#technology-stack)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
    - [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
    - [Adding a Supplier](#adding-a-supplier)
    - [Querying Suppliers](#querying-suppliers)
- [Request and Response Examples](#request-and-response-examples)
- [Swagger UI Documentation](#swagger-ui-documentation)
- [Exception Handling](#exception-handling)
- [Service Layer](#service-layer)
- [Contributing](#contributing)


## Features

- **Add Suppliers**: Create new suppliers with comprehensive validation.
- **Query Suppliers**: Retrieve suppliers based on various criteria.
- **Data Validation**: Use of enums for allowed values on certain parameters.
- **Interactive API Documentation**: Detailed documentation through Swagger.
- **Robust Exception Handling**: Handle errors gracefully with informative responses.

## Technology Stack

- **Java 22**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Hibernate**
- **Swagger/OpenAPI**
- **JUnit 5 & Mockito** (for testing)

## Getting Started

### Prerequisites

Ensure you have the following installed on your machine:

- Java 22
- Maven or Gradle (as a build tool)
- An IDE (like IntelliJ IDEA or Eclipse) for development (optional)

### Installation

1. **Clone the Repository**:

    ```bash
    git clone [https://github.com/your-user-name/makersharks-supplier-api.git]
    cd makersharks-supplier-api
    ```

2. **Build the Project**:

    For **Maven**:

    ```bash
    mvn clean install
    ```

    For **Gradle**:

    ```bash
    ./gradlew build
    ```

3. **Configure the Database**:

    Ensure your application can connect to a database (e.g., H2, MySQL, PostgreSQL) by updating the `application.yml` or `application.properties` with your database connection details.
 MYSQL application.properties:
Enter ur database name , username and password in the fields.

MYSQL application.properties:

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/mydatabase
spring.datasource.username=myuser
spring.datasource.password=secret
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql: true

### Running the Application

To start the Supplier Management API, use the following command:

For **Maven**:

```bash
mvn spring-boot:run
```

## API Endpoints

### Adding a Supplier

- **Endpoint**: `POST /suppliers/add`
- **Description**: Add a new supplier to the system.
- **Request Body**:

    ```json
    {
      "companyName": "Example Company",
      "website": "http://www.example.com",
      "location": "NEW_YORK",
      "natureOfBusiness": "medium_scale",
      "manufacturingProcesses": "Moulding"
    }
    ```

### Querying Suppliers

- **Endpoint**: `POST /api/supplier/query`
- **Description**: Retrieve suppliers filtered by location, nature of business, and manufacturing processes.
- **Query Parameters**:
  - `location`: Allowed values: ANY(ALREADY IN DB:`NEW_YORK`, `LOS_ANGELES`, `CHICAGO`, `HOUSTON`, `MIAMI`)
  - `natureOfBusiness`: Allowed values: `small_scale`, `medium_scale`, `large_scale`
  - `manufacturingProcesses`: Allowed values: `Moulding`, `3D_printing`, `Coating`,`Casting`


## Request and Response Examples

### Example Request

Using CURL to add a supplier:

```bash
curl -X POST http://localhost:8080/suppliers/add \
-H "Content-Type: application/json" \
-d '{
  "companyName": "Example Company",
  "website": "http://www.example.com",
  "location": "INDIA",
  "natureOfBusiness": "medium_scale",
  "manufacturingProcesses": "Moulding"
}'
```
### Example Response

On successful addition, you will receive a response like:

```json
{
  "supplierId": 1,
  "companyName": "Example Company",
  "website": "http://www.example.com",
  "location": "NEW_YORK",
  "natureOfBusiness": "MEDIUM_SCALE",
  "manufacturingProcesses": "Moulding"
}
```
## Swagger UI Documentation
You can view and interact with the API documentation through Swagger UI. To access the Swagger documentation, open your browser and navigate to:http://localhost:8080/swagger-ui.html
### How to Use Swagger UI

1. **Access the UI**: Open the above URL in your web browser.
2. **Explore API Endpoints**: 
   - The Swagger UI will display a list of all available API endpoints.
   - Each endpoint will show the HTTP method, endpoint URL, and a brief description.
3. **Try It Out**: 
   - Click on any endpoint to expand it.
   - You can view details such as request parameters, request body, and response types.
   - Use the "Try it out" button to send requests directly from the UI. Enter required input in the fields and hit the button to execute the request.
4. **View Responses**: 
   - After making a request, Swagger will display the server's response including the status code, response body, and any message returned.

### Benefits of Using Swagger UI

- **Interactive Documentation**: Provides a user-friendly interface for exploring and testing the API without needing additional tools (like Postman).
- **Immediate Feedback**: Developers can quickly test endpoints and see live responses, which aids in debugging and development.
- **Clear Structure**: Clearly organized documentation helps users understand the API’s capabilities and how to interact with it more effectively.
- 
## Exception Handling
The application incorporates a centralized approach for managing exceptions:

Error Responses: When an error occurs, the API returns structured JSON responses with appropriate HTTP status codes.
Custom Exception Classes: You can create specific exception classes to handle different error scenarios for clarity and maintainability.

## Service Layer
The service layer encapsulates the business logic of the application:

SupplierService: Manages operations related to suppliers, including adding, fetching, and deleting suppliers.
Validation Logic: Validates incoming data to ensure compliance with required formats and business rules.
Example Service Method

## Contributing
Contributions are welcome! If you'd like to contribute:

Fork the repository.
Create a new branch (git checkout -b feature-branch).
Make your changes and commit them (git commit -m 'Add some feature').
Push to the branch (git push origin feature-branch).
Create a Pull Request outlining your changes.

