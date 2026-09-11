# JobHub — Java Full Stack Job Platform

Production-oriented job marketplace built with Java 21, Spring Boot, PostgreSQL, Flyway and React.

## Highlights
- REST API with validation and centralized exception handling
- PostgreSQL persistence with versioned Flyway migrations
- Spring Security/JWT foundation for authenticated workflows
- OpenAPI/Swagger documentation
- Actuator health and metrics
- Responsive React job search and application flow
- Docker-ready backend and frontend
- GitHub Actions CI for backend verification and frontend builds
- Layered controller/service/repository architecture

## Architecture
React UI → REST API → Security → Service layer → Spring Data JPA → PostgreSQL

## Local development
Run PostgreSQL with Docker Compose, start the Spring Boot backend from `backend`, then run `npm install && npm run dev` from `frontend`.

API: `http://localhost:8080`  
Swagger: `http://localhost:8080/swagger-ui.html`

## Resume scope
Authentication and authorization, job search/filtering, employer job management, candidate applications, database migrations, validation, API documentation, automated CI, containerization, and responsive React UI.
