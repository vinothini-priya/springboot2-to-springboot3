# SpringBootSecurity

A Spring Boot application demonstrating authentication and authorization using **Spring Security**. The application uses **Spring Data JPA** with an embedded **H2 Database** and is packaged as an executable **JAR**.

---

## Technology Stack

| Component | Version |
|-----------|---------|
| Java | 8 |
| Spring Boot | 2.2.0.RELEASE |
| Spring Security | Included |
| Spring Data JPA | Included |
| Maven | 3.x |
| Database | H2 (Embedded) |
| Packaging | JAR |
| Embedded Server | Apache Tomcat |

---

## Features

- Spring Security authentication
- Spring Data JPA integration
- Embedded H2 database
- REST/Web application support
- JSP and JSTL support
- Embedded Tomcat server

---

## Project Structure

```
src
├── main
│   ├── java
│   ├── resources
│   └── webapp
└── test
```

---

## Prerequisites

- Java 8
- Maven 3.6 or later

Verify your installation:

```bash
java -version
mvn -version
```

---

## Build the Project

Clone the repository and navigate to the project directory.

Compile and build the application:

```bash
mvn clean install
```

Create the executable JAR:

```bash
mvn clean package
```

The generated JAR will be available under:

```
target/
```

---

## Run the Application

Run directly using Maven:

```bash
mvn spring-boot:run
```

Or execute the packaged JAR:

```bash
java -jar target/SpringBootSecurity-0.0.1-SNAPSHOT.jar
```

By default, the application starts on:

```
http://localhost:8080
```

---

## Database

The application uses an embedded **H2** database for development.

The database is initialized automatically during application startup.

---

## Dependencies

Major dependencies include:

- Spring Boot Starter Web
- Spring Boot Starter Security
- Spring Boot Starter Data JPA
- H2 Database
- Apache Tomcat
- Tomcat Jasper (JSP Support)
- JSTL
- Spring Boot Starter Test

---

## Testing

Run all tests:

```bash
mvn test
```

---

## Packaging

```
JAR
```

---

## Project Information

| Property | Value |
|----------|-------|
| Group ID | com.dineshonjava.sbsecurity |
| Artifact ID | SpringBootSecurity |
| Version | 0.0.1-SNAPSHOT |
| Java Version | 1.8 |
| Spring Boot Version | 2.2.0.RELEASE |

---

## License

This project is intended for educational and demonstration purposes.
