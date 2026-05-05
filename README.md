# NexusHR – Advanced Employee Management System

NexusHR is a full-stack Employee Management System built using **Spring Boot** and **React.js**.
It manages the complete employee lifecycle—from onboarding to department analytics, project assignments, and leave management.

---

## 🚀 Tech Stack

### Backend

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Bean Validation
* REST APIs

### Frontend

* React.js (Vite)
* Axios
* React Router DOM

---

## ✨ Features

### 👨‍💼 Employee Management

* Add new employees
* View employees with pagination
* Search employees (name, department, skill)
* Transfer employee between departments
* Promote employee (designation + salary)
* View leave balance

### 🏢 Department Management

* Create department
* View departments with pagination & search
* Update department
* Deactivate department (with validation)
* Department analytics (employees, salary, gender ratio)
* Bulk salary raise (transactional)

### 📊 Project Management

* Create project
* Assign employees with roles
* Remove employees from project
* View project backlog/milestones

### 📝 Leave Management

* Apply for leave
* Approve / Reject leave
* Leave balance calculation (CL / PL)

---

## 🔗 Entity Relationships

* **One-to-One:** Employee ↔ EmployeeProfile
* **Many-to-One:** Employee → Department
* **Many-to-Many:** Employee ↔ Project (via EmployeeProject)
* **One-to-Many:** Employee → LeaveRequest
* **One-to-Many:** Project → Milestone

---

## 📁 Project Structure

```bash
NexusHR/
│
├── nexushr-backend/
│   └── src/main/java/com/example/nexushr/
│       ├── config/
│       ├── controller/
│       ├── dto/
│       ├── entity/
│       ├── exception/
│       ├── repository/
│       ├── service/
│       ├── service/impl/
│       ├── specification/
│       └── NexusHrApplication.java
│
└── nexushr-frontend/
└── src/
├── api/
├── components/
├── pages/
├── App.jsx
└── main.jsx
```

---

## 📡 API Endpoints

### Employee APIs

| Method | Endpoint                             | Description       |
| ------ | ------------------------------------ | ----------------- |
| POST   | /api/v1/employees                    | Create employee   |
| GET    | /api/v1/employees                    | Get employees     |
| GET    | /api/v1/employees/search             | Search employees  |
| PUT    | /api/v1/employees/{id}/transfer      | Transfer employee |
| PUT    | /api/v1/employees/{id}/promotion     | Promote employee  |
| GET    | /api/v1/employees/{id}/leave-balance | Leave balance     |

### Department APIs

| Method | Endpoint                       | Description       |
| ------ | ------------------------------ | ----------------- |
| POST   | /api/v1/departments            | Create department |
| GET    | /api/v1/departments            | Get departments   |
| GET    | /api/v1/departments/{id}/stats | Analytics         |
| PUT    | /api/v1/departments/{id}       | Update            |
| DELETE | /api/v1/departments/{id}       | Deactivate        |
| PUT    | /api/v1/departments/{id}/raise | Bulk raise        |

### Project APIs

| Method | Endpoint                                | Description    |
| ------ | --------------------------------------- | -------------- |
| POST   | /api/v1/projects                        | Create project |
| POST   | /api/v1/projects/{id}/assign            | Assign team    |
| DELETE | /api/v1/projects/{id}/employees/{empId} | Remove         |
| GET    | /api/v1/projects/{id}/backlog           | Timeline       |

### Leave APIs

| Method | Endpoint                   | Description    |
| ------ | -------------------------- | -------------- |
| POST   | /api/v1/leaves/request     | Apply leave    |
| PUT    | /api/v1/leaves/{id}/status | Approve/Reject |

---

## 🔐 CORS Configuration

```java
.allowedOrigins("http://localhost:5173")
```

---

## 📦 Sample Requests

### Employee

```json
{
"firstName": "Krish",
"email": "[krish@example.com](mailto:krish@example.com)",
"gender": "MALE",
"designation": "Java Developer",
"salary": 45000,
"departmentId": 1
}
```

---

## 🧠 Concepts Used

* DTO Pattern
* Bean Validation
* JPA Relationships
* Specification API (Dynamic Filtering)
* Pagination
* Transaction Management
* REST API Design
* Exception Handling
* React API Integration

---

## 🚀 Future Enhancements

* JWT Authentication
* Role-based access (Admin / Manager / Employee)
* Dashboard charts
* Email notifications
* Payroll system

---

# 📄 Note

Copyright (c) 2026 Krish Patidar

This project is created for educational and demonstration purposes. While it is licensed under the MIT License, the author requests that the code should not be reused for personal, academic, or commercial projects without proper attribution or prior permission.
