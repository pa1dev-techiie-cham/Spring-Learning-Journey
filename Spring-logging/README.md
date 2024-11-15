# Spring Boot Default Logging Demo

## Objective
This project demonstrates the default logging features in Spring Boot by setting logging configurations in the `application.properties` file and using Spring's logging system across multiple packages. The objective is to showcase effective logging practices in a Spring Boot application for managing bean dependencies and logging messages, from initialization to application shutdown.

## Project Structure
The project is organized into three main packages:
- `com.pa1dev.springlabs`: Contains the main `SpringLoggingApplication` class, which acts as the entry point for the application.
- `com.pa1dev.springlabs.bean`: Contains business logic classes such as `Customer`, `PostPaid`, and `PrePaid` with `Plan` interface.
- `com.pa1dev.springlabs.exception`: Holds custom exception classes, specifically `CustomException`, for handling application-specific errors.

## Logging Configuration (application.properties)
To manage logging levels, patterns, and log file output, the following settings are added to the `application.properties` file:

```properties
# Setting the logging levels for specific packages
logging.level.com.pa1dev.springlabs=INFO
logging.level.com.pa1dev.springlabs.bean=DEBUG

# Configuring logging patterns for console and file outputs
logging.pattern.console=%d{yyyy-MMM-dd HH:mm:ss a} [%t] %-5level %logger{36} - %msg%n
logging.pattern.file=%d{yyyy-MMM-dd HH:mm:ss a} [%thread] %-5level %logger{36} - %msg%n

# Specifying the log file location and name
logging.file.name=logs/Error.log
