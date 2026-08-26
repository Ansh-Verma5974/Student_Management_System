# Student Management System

A console-based **Student Management System** developed using **Java, JDBC, and MySQL**. The application allows users to perform CRUD (Create, Read, Update, Delete) operations on student records through a menu-driven interface.

---

## Features

- Add a new student
- View all students
- Search a student by ID
- Update student details
- Delete a student
- Menu-driven console interface
- MySQL database integration using JDBC
- Exception handling for database operations

---

## Technologies Used

- Java
- JDBC
- MySQL
- IntelliJ IDEA

---

## Project Structure

```
StudentManagementSystem/
│
├── src/
│   ├── com.sms.main
│   ├── com.sms.dao
│   ├── com.sms.model
│   └── com.sms.util
│
├── database.sql
├── README.md
└── .gitignore
```

---

## Database Setup

1. Open MySQL Workbench.
2. Open the `database.sql` file.
3. Execute the script.
4. This will create:
    - Database: `student`
    - Table: `stu_data`

---

## Configure Database Connection

Open `DBConnection.java` and update your database credentials.

```java
private static final String URL = "jdbc:mysql://localhost:3306/student";
private static final String USER = "root";
private static final String PASSWORD = "YOUR_PASSWORD";
```

---

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Add the MySQL Connector/J JDBC driver.
4. Run `database.sql` in MySQL Workbench.
5. Update the database credentials in `DBConnection.java`.
6. Run `Main.java`.

---

## Sample Menu

```
========= Student Management System =========

1. Add Student
2. View Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
```

`markdown
Last Updated: 2026-08-26 00:12:34 IST

This section is automatically updated daily at 8:30 AM IST by GitHub Actions.

---

## Learning Outcomes

This project demonstrates:

- Object-Oriented Programming (OOP)
- JDBC Connectivity
- CRUD Operations
- MySQL Database Integration
- PreparedStatement
- ResultSet
- Exception Handling
- Modular Java Programming

---

## Author

**Ansh Verma**
