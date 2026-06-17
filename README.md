# AVYA HOME CRM

Production-ready monorepo scaffold for AVYA HOME CRM, a real estate plot management platform with separate Admin and Associate portals.

## Stack

- Frontend: React 18, TypeScript, Vite, Tailwind CSS, Recharts
- Backend: Java 17, Spring Boot 3, Spring Security, JWT, JPA/Hibernate, Maven
- Database: MySQL 8
- Deployment: Docker Compose with Nginx-ready frontend container

## Quick start

```bash
docker compose up --build
```

Services:

- Frontend: http://localhost:3000
- Backend API: http://localhost:8080/api
- MySQL: localhost:3306

## Local development

Frontend:

```bash
cd frontend
npm install
npm run dev
```

Backend:

```bash
cd backend
mvn spring-boot:run
```

## Default environment

Copy `.env.example` to `.env` and update secrets before deployment. JWT and database credentials in the example are development-only.
