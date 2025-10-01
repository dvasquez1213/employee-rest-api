# Employee REST API

A simple REST API for managing a list of employees, built with Java and the Spring Boot framework.

## Technologies Used

* Java 17

* Spring Boot 3

* Gradle

* JUnit 5 (for testing)

## API Endpoints

### Get All Employees

* **URL:** /employees

* **Method:** GET

* **Description:** Retrieves a list of all employees.

### Add New Employee

* **URL:** /employees

* **Method:** POST

* **Description:** Adds a new employee to the list.

* **Request Body:**

  ```json

  {

  "employee_id": "4",

  "first_name": "Sam",

  "last_name": "Wilson",

  "email": "sam.wilson@example.com",

  "title": "Engineer"

  }
