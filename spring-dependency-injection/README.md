# Employee Management System

## Overview
This project is a Spring-based Employee Management System that demonstrates the use of Dependency Injection (DI) through both constructor and setter methods. It allows for the management of employee records, enabling the addition and removal of employees, as well as fetching employee details based on unique IDs.

### Key Features
- Add new employees with unique IDs.
- Remove employees based on their ID.
- Fetch details of a single employee by ID.
- Retrieve a list of all employees.
- Utilizes `LinkedHashSet<EmployeeDTO>` for storing employee records to maintain insertion order and uniqueness.

## Technologies Used
- **Spring Framework**: For Dependency Injection and application management (version 3.3.6).
- **Java**: Programming language used for implementation (Java 17).
- **LinkedHashSet**: Data structure used for storing employees with unique IDs.

## Getting Started

### Prerequisites
- JDK 17 or higher
- Maven 3.6.3 or higher
- **Spring Tool Suite 4 (STS4)**: Integrated Development Environment (IDE) used for development.

### Installation
Follow these steps to set up the project locally.

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/spring-dependency-injection.git
    ```

2. **Navigate to the project directory**:
    ```bash
    cd spring-dependency-injection
    ```

3. **Install dependencies**:
    ```bash
    mvn install
    ```

4. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

## What I Learned
- Implemented **Constructor Injection** and **Setter Injection** in Spring, understanding their benefits and use cases.
- Gained hands-on experience with managing collections in Java, specifically using `LinkedHashSet` for unique and ordered employee records.
- Developed skills in designing a simple application architecture that employs the principles of Dependency Injection for better maintainability and testability.

## Challenges and Solutions
### Challenge 1
- **Description**: Ensuring employee IDs are unique while adding employees.
- **Solution**: Implemented checks before adding new employees to the `LinkedHashSet` to maintain uniqueness.

### Challenge 2
- **Description**: Fetching a single employee by ID efficiently.
- **Solution**: Designed a method that iterates over the `LinkedHashSet` to find the employee by ID.

## Key Spring Concepts Used
- **Dependency Injection**: Utilizing both constructor and setter injection to manage dependencies.
- **@Component**: For marking the Employee management components as Spring beans.
- **@Service**: For the service layer to handle business logic related to employee management.
- **@Repository**: For data access layer responsibilities.
