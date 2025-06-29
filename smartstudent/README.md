# SmartStudent: Java-Based Student Management System

A simple Student Management System using Java, JDBC, and MySQL.

## Features

✅ Admin login (static credentials: admin / admin123)  
✅ Add new student  
✅ View all students  
✅ Update student by roll number  
✅ Delete student by roll number  
✅ Search student by:
- Roll number
- Department
- Marks range

## How to Run

1. Make sure MySQL is running and your database exists.
2. Run the SQL in `student.sql` to create the table:
   ```sql
   CREATE DATABASE smartstudent_db;
   USE smartstudent_db;

   CREATE TABLE students (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(100) NOT NULL,
       roll_no VARCHAR(20) UNIQUE NOT NULL,
       department VARCHAR(50) NOT NULL,
       email VARCHAR(100),
       phone VARCHAR(20),
       marks INT
   );
   ```
3. Compile all `.java` files:
   ```bash
   javac -cp ".;mysql-connector-j-9.3.0.jar" *.java
   ```
4. Run the app:
   ```bash
   java -cp ".;mysql-connector-j-9.3.0.jar" Main
   ```

## Database Connection

- Host: localhost
- Database: smartstudent_db
- User: root
- Password: (your MySQL password)

## Requirements

- Java 8+
- MySQL
- mysql-connector-j .jar file
# SmartStudent: Java-Based Student Management System

## Overview
SmartStudent is a console-based Student Management System built in Java with JDBC and MySQL.

### Features
- Admin login with static credentials
- Add new students
- View all students
- Update student details by roll number
- Delete students by roll number
- Search students:
  - By roll number
  - By department
  - By marks range
- MySQL database integration

## Database Details
- Database name: `smartstudent_db`
- Table name: `students`
- Fields:
  - id (int, primary key, auto_increment)
  - name (varchar)
  - roll_no (varchar, unique)
  - department (varchar)
  - email (varchar)
  - phone (varchar)
  - marks (int)

## How to Run

1. Import `student.sql` into your MySQL server to create the table.
2. Compile Java files:
    ```
    javac -cp ".;mysql-connector-j-9.3.0.jar" *.java
    ```
3. Run the application:
    ```
    java -cp ".;mysql-connector-j-9.3.0.jar" Main
    ```

## Credentials
- Username: `admin`
- Password: `admin123`

## Screenshots or Video
See:
- `/screenshots/` folder
or
- `video/smartstudent_demo.mp4`

## Author
- Megha

