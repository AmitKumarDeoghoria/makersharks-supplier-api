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
    - [Retrieving Supplier by ID](#retrieving-supplier-by-id)
    - [Deleting a Supplier](#deleting-a-supplier)
- [Request and Response Examples](#request-and-response-examples)
- [Swagger UI Documentation](#swagger-ui-documentation)
- [Exception Handling](#exception-handling)
- [Service Layer](#service-layer)
- [Contributing](#contributing)
- [License](#license)

## Features

- **Add Suppliers**: Create new suppliers with comprehensive validation.
- **Query Suppliers**: Retrieve suppliers based on various criteria.
- **Data Validation**: Use of enums for allowed values on certain parameters.
- **Interactive API Documentation**: Detailed documentation through Swagger.
- **Robust Exception Handling**: Handle errors gracefully with informative responses.

## Technology Stack

- **Java 17**
- **Spring Boot 2.x**
- **Spring Data JPA**
- **Hibernate**
- **Swagger/OpenAPI**
- **JUnit 5 & Mockito** (for testing)

## Getting Started

### Prerequisites

Ensure you have the following installed on your machine:

- Java 17 or higher
- Maven or Gradle (as a build tool)
- An IDE (like IntelliJ IDEA or Eclipse) for development (optional)

### Installation

1. **Clone the Repository**:

    ```bash
    git clone https://github.com/yourusername/supplier-management-api.git
    cd supplier-management-api
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

### Running the Application

To start the Supplier Management API, use the following command:

For **Maven**:

```bash
mvn spring-boot:run
