# Employee and Address Management

This Spring Boot application provides APIs to manage Employee and Address entities in a database.This Spring Boot application designed to facilitate the management of employee and address records. This project offers a RESTful API with endpoints for creating, reading, updating, and deleting employee and address information.

## Purpose

The primary purpose of this project is to provide a simple yet robust solution for organizations or applications that need to manage employee data and associated address information. It offers a flexible and extensible API for performing CRUD (Create, Read, Update, Delete) operations on employee and address records.

## Features

- **Employee Management:**
  - Create, read, update, and delete employee records.
  - Retrieve a list of all employees.
  - Retrieve an employee by their unique ID.
  
- **Address Management:**
  - Create, read, update, and delete address records.
  - Retrieve a list of all addresses.
  - Retrieve an address by its unique ID.
  
- **Data Validation:**
  - Input data validation to ensure data integrity.
  - Error handling and proper HTTP status codes for invalid requests.

- **Data Flow:**
  - Clear data flow from API requests to service classes and database operations.
  - Utilizes Spring Data JPA for efficient database interaction.

## Getting Started

Follow these steps to get started with the Employee and Address Management API:

1. **Clone the Repository:** Clone this repository to your local development environment.

2. **Database Configuration:** Configure the database connection properties in the `application.properties` file to match your database system (e.g., MySQL, PostgreSQL).

3. **Build and Run:** Build the project and run the Spring Boot application. The API will be available at the specified port (default: 8080).

4. **API Usage:** Start making HTTP requests to the API endpoints described in the README to manage employee and address records.


## Technology Stack

- Spring Boot: A powerful framework for building Java applications.
- Spring Data JPA: Simplifies database access with Java Persistence API (JPA).
- Java: The primary programming language used for this project.


# Data Flow in the Project

This section explains the flow of data within the Employee and Address Management project, starting from API requests and ending with data storage and retrieval.

## API Requests

1. **HTTP Requests:** Clients (e.g., web browsers, applications) send HTTP requests to the API endpoints provided by the Employee and Address controllers.

2. **Controller Layer:** The controller classes (`EmployeeController` and `AddressController`) receive and handle incoming HTTP requests. They are responsible for parsing request parameters, validating input, and invoking the appropriate service methods.

## Service Layer

3. **Service Classes:** The controller classes delegate business logic and data operations to the service classes (`EmployeeService` and `AddressService`).

4. **Business Logic:** Service methods in the service classes perform business logic, such as creating, reading, updating, or deleting employee and address records.

## Data Access Layer

5. **Data Repositories:** Service methods interact with data repositories, which are interfaces provided by Spring Data JPA (`EmployeeRepository` and `AddressRepository`). These repositories extend Spring Data's `JpaRepository` interface, simplifying database operations.

6. **Database Operations:** Data repositories translate method calls into SQL queries, allowing data to be stored, retrieved, updated, or deleted in the connected database.

## Database

7. **Database Storage:** Data is stored and managed in a relational database system (e.g., MySQL, PostgreSQL) with tables for Employee and Address entities.

## API Responses

8. **Controller Responses:** After the service methods have processed the data, the controller classes generate HTTP responses. These responses typically include JSON data representing the results of the requested operations.

9. **HTTP Responses:** The API sends HTTP responses back to the clients, providing information about the success or failure of the requested operations.

This data flow illustrates how API requests are processed by controllers, delegated to service classes for business logic and data operations, and eventually interact with the database to store and retrieve data. Understanding this flow will help you work with and extend the project's functionality.


## Employee API

### Get All Employees

- **Endpoint:** 
```
GET http://localhost:8080/api/employees
```

- **Description:** Retrieve a list of all employees.
- **Response:** JSON array containing employee details.

### Get Employee by ID

- **Endpoint:** 
```
GET http://localhost:8080/api/employees/{id}
```

- **Description:** Retrieve an employee by their unique ID.
- **Parameters:** `id` - The ID of the employee.
- **Response:** JSON object containing employee details.

### Create New Employee

- **Endpoint:** 
```
POST http://localhost:8080/api/employees
```

- **Description:** Create a new employee.
- **Request Body:** JSON object with employee details.
- **Response:** JSON object containing the newly created employee's details.

### Update Employee by ID

- **Endpoint:** 
```
PUT http://localhost:8080/api/employees/{id}
```

- **Description:** Update an existing employee by their ID.
- **Parameters:** `id` - The ID of the employee to update.
- **Request Body:** JSON object with updated employee details.
- **Response:** JSON object containing the updated employee's details.

### Delete Employee by ID

- **Endpoint:** 
```
DELETE http://localhost:8080/api/employees/{id}
```

- **Description:** Delete an employee by their ID.
- **Parameters:** `id` - The ID of the employee to delete.
- **Response:** No content (HTTP status code 204) on successful deletion.

## Sample Employee Payload
```
[
    {
        "empId": 1,
        "firstName": "John",
        "lastName": "Doe",
        "address": {
            "addressId": 4
        }
    },
    {
        "empId": 2,
        "firstName": "Alice",
        "lastName": "Smith",
        "address": {
            "addressId": 9
        }
    },
    {
        "empId": 3,
        "firstName": "Bob",
        "lastName": "Johnson",
        "address": {
            "addressId": 18
        }
    },
    {
        "empId": 4,
        "firstName": "Emily",
        "lastName": "Brown",
        "address": {
            "addressId": 10
        }
    },
    {
        "empId": 5,
        "firstName": "David",
        "lastName": "Lee",
        "address": {
            "addressId": 17
        }
    }
]

```

## Address API

### Get All Addresses

- **Endpoint:** 
```
GET http://localhost:8080/api/addresses
```

- **Description:** Retrieve a list of all addresses.
- **Response:** JSON array containing address details.

### Get Address by ID

- **Endpoint:** 
```
GET http://localhost:8080/api/addresses/{id}
```

- **Description:** Retrieve an address by its unique ID.
- **Parameters:** `id` - The ID of the address.
- **Response:** JSON object containing address details.

### Create New Address

- **Endpoint:** 
```
POST http://localhost:8080/api/addresses
```

- **Description:** Create a new address.
- **Request Body:** JSON object with address details.
- **Response:** JSON object containing the newly created address's details.

### Update Address by ID

- **Endpoint:** 
```
PUT http://localhost:8080/api/addresses/{id}
```

- **Description:** Update an existing address by its ID.
- **Parameters:** `id` - The ID of the address to update.
- **Request Body:** JSON object with updated address details.
- **Response:** JSON object containing the updated address's details.

### Delete Address by ID

- **Endpoint:** 
```
DELETE http://localhost:8080/api/addresses/{id}
```

- **Description:** Delete an address by its ID.
- **Parameters:** `id` - The ID of the address to delete.
- **Response:** No content (HTTP status code 204) on successful deletion.

## Sample Address Payload
```
[
	{
        "addressId": 1,
        "street": "123 Main Street",
        "city": "New York",
        "state": "New York",
        "zipCode": "100001"
    },
    {
        "addressId": 2,
        "street": "456 Elm Street",
        "city": "Los Angeles",
        "state": "California",
        "zipCode": "900012"
    },
    {
        "addressId": 3,
        "street": "789 Oak Street",
        "city": "Chicago",
        "state": "Illinois",
        "zipCode": "606013"
    },
    {
        "addressId": 4,
        "street": "101 Pine Street",
        "city": "San Francisco",
        "state": "California",
        "zipCode": "941014"
    },
    {
        "addressId": 5,
        "street": "222 Cedar Street",
        "city": "Houston",
        "state": "Texas",
        "zipCode": "770015"
    }
]

```

## Controller Classes

### EmployeeController

- `getAllEmployees()`: Retrieve a list of all employees.
- `getEmployeeById(Long id)`: Retrieve an employee by their unique ID.
- `createEmployee(Employee employee)`: Create a new employee.
- `updateEmployee(Long id, Employee updatedEmployee)`: Update an existing employee by their ID.
- `deleteEmployee(Long id)`: Delete an employee by their ID.

### AddressController

- `getAllAddresses()`: Retrieve a list of all addresses.
- `getAddressById(Long id)`: Retrieve an address by its unique ID.
- `createAddress(Address address)`: Create a new address.
- `updateAddress(Long id, Address updatedAddress)`: Update an existing address by its ID.
- `deleteAddress(Long id)`: Delete an address by its ID.

Feel free to use these APIs and controller classes, along with the provided service class methods, to manage employee and address data in your application.
This README now includes explanations for both the APIs and controller classes to help users and developers understand how to use and interact with your Spring Boot application.



## Service Classes

### EmployeeService

- `getAllEmployees()`: Retrieve a list of all employees.
- `getEmployeeById(Long id)`: Retrieve an employee by their unique ID.
- `createEmployee(Employee employee)`: Create a new employee.
- `updateEmployee(Long id, Employee updatedEmployee)`: Update an existing employee by their ID.
- `deleteEmployee(Long id)`: Delete an employee by their ID.

### AddressService

- `getAllAddresses()`: Retrieve a list of all addresses.
- `getAddressById(Long id)`: Retrieve an address by its unique ID.
- `createAddress(Address address)`: Create a new address.
- `updateAddress(Long id, Address updatedAddress)`: Update an existing address by its ID.
- `deleteAddress(Long id)`: Delete an address by its ID.


Feel free to use these APIs and service class methods to manage employee and address data in your application.

## Contributors

- **Raj Anand** : [rajanandXXXX@gmail.com]()

We welcome contributions and feedback to improve and expand this project.

Contributions to this project are welcome! If you have suggestions, enhancements, or bug fixes, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgments

Special thanks to the Spring Boot and Spring Data JPA communities for their excellent documentation and support.
