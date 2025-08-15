# Employee-Database-App
Employee Database App and perform CURD Operations
# Java JDBC – Employee Database App

A console-based Java application that connects to a MySQL database using JDBC and performs basic **CRUD operations** (Create, Read, Update, Delete) on an employee table.

---

## Features
- Connects to **MySQL** database using JDBC
- Add new employees
- View all employees
- Update employee details
- Delete employees
- Menu-driven console interface

---

## Technologies Used
- **Java 17+** (works with Java 8+)
- **MySQL 8.x** (or compatible)
- **JDBC (Java Database Connectivity)**
- **MySQL Connector/J** driver

---

##  Project Structure
/EmployeeDBApp
├── DBConnection.java # Handles database connection
├── Employee.java # Employee model class
├── EmployeeDAO.java # Data Access Object for CRUD
├── EmployeeDBApp.java # Main console application
├── lib/
└── mysql-connector-j-8.x.x.jar # MySQL JDBC driver



---

## Setup Instructions

## 1️ Install MySQL
- Install **MySQL Server** from [https://dev.mysql.com/downloads/](https://dev.mysql.com/downloads/)
- Start the MySQL service

## Create Database and Table
Run these commands in MySQL shell or any SQL client:
```sql
CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    role VARCHAR(100) NOT NULL,
    salary DOUBLE NOT NULL
);
