# 📑 InsuranceApp-Secure

**A Spring Boot application for managing insurance contracts with Session-Based Authentication and user activity logging.**

---

## 🚀 Features

- 🔒 **Secure Authentication**: Session-Based Authentication with Spring Security.
- 👥 **User Roles**: Support for ROLE_USER and ROLE_ADMIN.
- 📝 **User Activity Logging**: Track and store user activities for admin review.
- 🛠️ **Test Profile**: Simplified authentication in TEST mode with any password.
- 📦 **Deployment Ready**: Docker and Jenkins integration for seamless deployment.
- 🖥️ **Insurance Management**: Manage Automobile, Home, and Health insurance contracts.

---

## 📋 Requirements

- **Java 17+**
- **Spring Boot 3.x**
- **MySQL/PostgreSQL (for user data and roles)** 
- **Docker (for deployment)**
- **Jenkins (for CI/CD pipeline)**

---

## 🏗️ Installation & Setup

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/yourusername/InsuranceApp-Secure.git
   cd InsuranceApp-Secure


## 📋 Set Up the Database  
Create a MySQL/PostgreSQL database and update the `application.properties` or `application.yml` file.

---

## 🏗️ Run the Application  

```bash
./mvnw spring-boot:run
```

## 🌐 Access the Application
Open your browser and go to: [http://localhost:8080](http://localhost:8080)

---

## 🐳 Docker Deployment

### Build Docker Image
```bash
docker build -t insuranceapp-secure .

```
## 🛠️ Development Tools

Spring Security: For authentication and role-based access control.
JPA/Hibernate: For database interactions.
JUnit/Mockito: For unit and integration testing.
Lombok: To simplify Java code.
Maven: Build and dependency management



## 📜 License
This project is licensed under the MIT License.

## 📧 Contact
For questions or feedback, contact us at douaachemnane@gmail.com.

