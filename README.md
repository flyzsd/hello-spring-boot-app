# hello-spring-boot-app

A demo Spring Boot application with Kotlin, MySQL, and Docker support.

**Stack**: Spring Boot 4.0.6 + Java 25 + Kotlin 2.3.21 + MySQL

## 🚀 Quick Start

Get running in 5 minutes:

```bash
docker compose up -d
curl http://localhost:8080/actuator/health
```

## ⚡ Common Commands

```bash
# Build
mvn clean package

# Run tests
mvn test

# Start with Docker Compose
docker compose up -d

# Stop services
docker compose down

# View logs
docker compose logs -f spring-app
```

## 🏗️ Project Structure

```
src/
├── main/kotlin/              # Application code
├── main/resources/           # Configuration
└── test/kotlin/              # Tests
```

## 📋 Requirements

- Java 25
- Maven 3.6+
- Docker & Docker Compose (for running services)

## 🐳 Docker

Build and run with Docker Compose:

```bash
docker compose up -d
```

This starts:
- Spring Boot application on port 8080
- MySQL database on port 3306
