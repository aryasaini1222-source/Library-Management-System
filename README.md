# 📚 Library Management System

A full-stack Java-based **Library Management System** built using **Spring Boot**, **Spring Data JPA**, **Thymeleaf**, and **MySQL**.  
This project allows users to manage books and members efficiently through a web interface.

---

## 🚀 Features

- Add, update, and delete books
- View the list of all books and users
- Manage user information
- Persistent storage using MySQL database
- User-friendly web interface built with Thymeleaf
- Built using MVC architecture

---

## 🛠️ Technology Stack

| Technology       | Description                |
|------------------|----------------------------|
| Java (JDK 8+)    | Core programming language  |
| Spring Boot      | Backend framework          |
| Spring Data JPA  | ORM framework for database |
| Thymeleaf        | Frontend templating engine |
| MySQL            | Database                   |
| Maven            | Build and dependency tool  |
| VS Code / IntelliJ | IDE for developing      |

---

## ⚙️ How to Run the Project Locally

### 1️⃣ Prerequisites
Make sure you have installed:

- Java JDK 8+
- Maven
- MySQL Server
- IDE (e.g. VS Code or IntelliJ IDEA)

---

### 2️⃣ Clone the Repository
```bash
git clone https://github.com/aryasaini1222-source/Library-Management-System.git
cd Library-Management-System

CREATE DATABASE library_db;

Update the database configurations in src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/library_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update


4️⃣ Run the Application
mvn spring-boot:run


Or run the LibraryManagementSystemApplication.java class from your IDE.

5️⃣ Access the Application

Open your browser and navigate to:
👉 http://localhost:8080/
