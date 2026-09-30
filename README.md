# 📝 Blogging Project

A full-stack blogging application built using **Spring Boot, Thymeleaf, Bootstrap and MySQL**.

This project provides a simple and responsive web interface to create, view, update and delete blog posts.

---

## 🚀 Features

- Create a new blog post
- View all blog posts
- Edit existing blog posts
- Delete blog posts
- MySQL database integration
- Spring Data JPA for database operations
- Thymeleaf for server-side HTML rendering
- Responsive UI using Bootstrap
- Maven-based project
- CRUD functionality

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java 17 | Programming Language |
| Spring Boot 4.1.1 | Backend Framework |
| Spring Data JPA | Database Access |
| Hibernate | ORM |
| Thymeleaf | Server-side HTML Rendering |
| Bootstrap 5 | Responsive UI |
| MySQL | Database |
| Maven | Build & Dependency Management |
| IntelliJ IDEA | Development IDE |
| Git & GitHub | Version Control |

---

## 📂 Project Structure

```text
blogging-project/
│
├── .mvn/
│   └── wrapper/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── blog/
│   │   │           └── bloggingproject/
│   │   │               │
│   │   │               ├── controller/
│   │   │               │   └── PostController.java
│   │   │               │
│   │   │               ├── model/
│   │   │               │   └── Post.java
│   │   │               │
│   │   │               ├── repository/
│   │   │               │   └── PostRepository.java
│   │   │               │
│   │   │               └── BloggingProjectApplication.java
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       │
│   │       ├── templates/
│   │       │   ├── index.html
│   │       │   ├── new_post.html
│   │       │   └── edit_post.html
│   │       │
│   │       └── application.properties
│   │
│   └── test/
│
├── .gitignore
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md

🏗️ Application Architecture
The application follows a simple MVC architecture:
User
  │
  ▼
Thymeleaf + Bootstrap UI
  │
  ▼
PostController
  │
  ▼
PostRepository
  │
  ▼
Spring Data JPA / Hibernate
  │
  ▼
MySQL Database

📋 CRUD Operations
Create
Users can create a new blog post by providing:
- Title
- Author
- Content
The post is saved into the MySQL database.
Read
The home page displays all available blog posts.
Update
Existing posts can be edited using their Post ID.
Delete
Posts can be deleted using their Post ID.
🌐 Application URLs
URL	Method	Description
/	GET	Display all posts
/new	GET	Open new post form
/save	POST	Save a new post
/edit/{id}	GET	Open post for editing
/update	POST	Update an existing post
/delete/{id}	GET	Delete a post


🗄️ Database Setup
Create a MySQL database:
CREATE DATABASE blogging_db;

Select the database:
USE blogging_db;

Spring Boot with JPA/Hibernate can create/update the required table automatically when configured with:
spring.jpa.hibernate.ddl-auto=update

⚙️ Database Configuration
Open:
src/main/resources/application.properties

Configure your MySQL connection:
spring.application.name=bloggingProject

spring.datasource.url=jdbc:mysql://localhost:3306/blogging_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

Important: Do not upload your real database password to a public GitHub repository.

For production or public repositories, use environment variables instead of hard-coding credentials.

▶️ How to Run the Project
1. Clone the Repository
git clone https://github.com/atharavsawant52/blogging-project.git

2. Navigate to the Project
cd blogging-project

3. Configure MySQL
Create the database:
CREATE DATABASE blogging_db;

Then update your database username and password in:
application.properties

4. Run the Application
Using Maven Wrapper on Windows:
mvnw.cmd spring-boot:run

Or using Maven:
mvn spring-boot:run

5. Open the Application
Open your browser and visit:
http://localhost:8080

🧪 Example Blog Post
Title
Getting Started with Spring Boot

Author
Atharav

Content
Spring Boot makes it easy to build modern Java web applications.
It provides auto-configuration, embedded servers, and easy integration
with databases. This project demonstrates how to build a simple CRUD
blogging application using Spring Boot, Thymeleaf and MySQL.

🎨 User Interface
The application provides:
- Responsive navigation bar
- Blog post listing
- Create post form
- Edit post form
- Delete functionality
- Bootstrap-based responsive design
- Clean and simple user interface

🔄 CRUD Flow
                ┌─────────────────┐
                │   Home Page     │
                │      (/)        │
                └────────┬────────┘
                         │
          ┌──────────────┼──────────────┐
          ▼              ▼              ▼
     Create Post      Edit Post      Delete Post
          │              │              │
          ▼              ▼              ▼
       /new           /edit/{id}    /delete/{id}
          │              │
          ▼              ▼
        /save          /update
          │              │
          └──────┬───────┘
                 ▼
          ┌──────────────┐
          │    MySQL     │
          │   Database   │
          └──────────────┘

📚 What I Learned
This project helped me understand:
- Spring Boot project structure
- MVC architecture
- Spring MVC Controllers
- Spring Data JPA
- Repository pattern
- CRUD operations
- Entity mapping
- Thymeleaf
- Model attributes
- Form handling
- Path variables
- MySQL integration
- Hibernate
- Bootstrap responsive design
- Maven
- Git and GitHub

🔮 Future Improvements
The project can be extended with:
- User registration and login
- Spring Security
- User authentication
- Password encryption
- Blog categories
- Comments
- Search functionality
- Pagination
- Post images
- Rich text editor
- REST API
- Cloud database
- Deployment to a cloud platform

👨‍💻 Author
Atharav Sawant
GitHub:
https://github.com/atharavsawant52

📄 License
This project is created for learning and portfolio purposes.
