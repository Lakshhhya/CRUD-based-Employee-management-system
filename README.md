# CRUD-based-Employee-management-system

## Description

This project is a web-based CRUD (Create, Read, Update, Delete) application designed to manage employee records. It showcases the implementation of Java Servlets, JDBC, and MySQL, adhering to the Model-View-Controller (MVC) design pattern.

The project demonstrates robust database connectivity, efficient web application architecture, and practical CRUD operations, making it an ideal example of core Java development.

---

## Features

- **CRUD Operations:** Create, view, update, and delete employee records.
- **MVC Architecture:**
- **Model**: Data Access Object (DAO) for database interactions.
- **View:** Servlets handling user interface responses.
- **Controller**: Coordination of requests and database communication.
- **Database Connectivity**: Uses JDBC to interact with MySQL.
- **Servlet-based Backend:** Demonstrates dynamic request handling.

---

## Technologies Used

- **Backend**: Core Java, Java Servlets
- **Database**: MySQL
- **Architecture**: MVC Pattern
- **Server**: Apache Tomcat
- **Tools**: JDBC Driver, MySQL Workbench


---

## Installation and Setup
1. Clone the Repository:
```bash
git clone https://github.com/<your-repository-link>.git
```

2. Database Configuration:
- Create a database in MySQL.
- Update the DAO class with your database credentials:

```bash
String url = "jdbc:mysql://localhost:3306/<database-name>";
String uname = "<root>";
String pass = "<password>";
```

3. Build and Deploy:
- Import the project into your IDE (IntelliJ IDEA/Eclipse).
- Deploy it on Apache Tomcat.
- Run the application via localhost.

---

## Future Enhancements
- Authentication: Add user login and role-based access.
- Enhanced UI: Integrate front-end frameworks for improved user experience.
- REST API: Extend the project with RESTful services for wider accessibility.
 
---

## Author

Lakshya Dalal
