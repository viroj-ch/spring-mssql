# spring-mssql

In this project, we want to run a Spring Boot application with the database MS SQL.
We'll use Docker Compose to run MS SQL. 

## Usage
```bash
docker-compose up -d
```

```bash
./gradlew bootRun
```

## Destription

We use 
* MS SQL 
* Java 1.8
* Spring boot 2.4.2

Example of 
* Spring boot application connect to MS SQL
* Using gradle plugin to add test sets (integrationTest)
* Using testcontainers MS SQL for integrationTest
