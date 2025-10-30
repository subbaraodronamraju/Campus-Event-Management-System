# 🎓 Campus Event Management System (RCE)

A **Spring Boot** application that simplifies how college students and administrators manage campus events.  
It provides modules for creating, categorizing, registering, and managing events — connecting users through campus activities.

---

## 🚀 Features

- 👨‍🎓 **User Management** — Add, update, and view student and admin profiles  
- 🎯 **Event Management** — Create, list, update, and delete campus events  
- 🗂️ **Category Management** — Organize events into various categories  
- 📝 **Event Registration** — Students can register for and track event participation  
- 🔐 **Role-Based Access (future scope)** — Admins manage, students participate  
- 💾 **Persistent Storage** — All data stored via Spring Data JPA (MySQL)

---

## 🧩 Entity Relationships (ER Overview)

| Entity | Relationships |
|---------|----------------|
| **User** | One-to-Many with Events and Registrations |
| **Events** | Many-to-One with User and Category; One-to-Many with Registrations |
| **Categories** | One-to-Many with Events |
| **Registrations** | Many-to-One with User and Event |

**Simplified Diagram:**



User ───< Events >─── Categories
│ │
│ └──< Registrations >─── Event
└─────────────────────────────────┘


---


---

## 🏗️ Tech Stack

**Backend Frameworks**
- Java 17+
- Spring Boot (3.x)
- Spring Web (REST Controllers)
- Spring Data JPA (Hibernate)
- Lombok

**Database**
- MySQL (recommended)
- H2 (for testing)

**Build Tool**
- Maven

**Development Tools**
- Spring Tool Suite (STS) / IntelliJ IDEA
- Postman (for API testing)
- Git & GitHub

---

## 🧠 Entity Summary

| Entity | Description |
|---------|-------------|
| **User** | Represents a student or admin; can create and register for events |
| **Events** | Core module for campus events; linked to creator and category |
| **Categories** | Organizes events by type (Cultural, Technical, etc.) |
| **Registrations** | Connects users to events with registration details |

---

## 🌐 REST Controller Overview

Each controller follows RESTful design conventions for clean and modular APIs.

| Controller | Base Path | Description |
|-------------|------------|-------------|
| `UserController` | `/api/users` | Manages user creation, updates, and retrieval |
| `EventController` | `/api/events` | Handles event CRUD operations |
| `CategoryController` | `/api/categories` | Manages event categories |
| `RegistrationController` | `/api/registrations` | Manages user-event registrations |

---

## 📡 Example API Endpoints

### 👤 **UserController**
| Method | Endpoint | Description |
|---------|-----------|-------------|
| `POST` | `/api/users` | Create new user |
| `GET` | `/api/users` | Get all users |
| `GET` | `/api/users/{id}` | Get user by ID |

**Sample Request**
```json
POST /api/users
{
  "userName": "John Doe",
  "email": "john@example.com",
  "password": "12345",
  "branch": "CSE",
  "role": "STUDENT",
  "yearOfStudy": "3rd Year",
  "interests": "AI, ML"
}
