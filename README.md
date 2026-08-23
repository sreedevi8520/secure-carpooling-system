\# 🚗 Secure Carpooling System



A full-stack web application that enables users to \*\*offer rides, search for available rides, and book seats securely\*\*. The system is built using \*\*Java Spring Boot, MySQL, HTML, CSS, and JavaScript\*\*, with RESTful APIs connecting the frontend and backend.



\## 📌 Project Overview



The Secure Carpooling System is designed to simplify ride sharing between users traveling along similar routes.



Users can register and log in, search for rides based on source, destination, and travel date, offer new rides, and book available seats.



The backend provides REST APIs for user management, ride management, and booking operations, while MySQL is used for persistent data storage.



\---



\## ✨ Features



\* 👤 User Registration

\* 🔐 Secure User Login

\* 🔒 BCrypt Password Encryption

\* 🚗 Offer a Ride

\* 🔎 Search Available Rides

\* 📅 Search Rides by Travel Date

\* 🎫 Book Available Seats

\* 📋 View My Bookings

\* 💺 Track Number of Seats Booked

\* 📊 Ride and Booking Management

\* 🌐 RESTful API Integration

\* 🗄️ MySQL Database Integration

\* 📱 Responsive Web Interface



\---



\## 🛠️ Tech Stack



\### Frontend



\* HTML5

\* CSS3

\* JavaScript

\* Fetch API

\* Responsive UI Design



\### Backend



\* Java

\* Spring Boot

\* Spring Web

\* Spring Data JPA

\* Hibernate

\* REST APIs

\* Maven



\### Database



\* MySQL

\* MySQL Workbench



\### Security



\* BCrypt Password Encoder

\* Environment-based database password configuration



\### Development Tools



\* Visual Studio Code

\* Git

\* GitHub

\* Postman / PowerShell REST API testing

\* MySQL Workbench



\---



\## 🏗️ Project Architecture



```text

&#x20;                   Secure Carpooling System

&#x20;                             │

&#x20;            ┌────────────────┴────────────────┐

&#x20;            │                                 │

&#x20;       Frontend                            Backend

&#x20;            │                                 │

&#x20;    HTML + CSS + JS                    Java Spring Boot

&#x20;            │                                 │

&#x20;       Fetch API                        REST APIs

&#x20;            │                                 │

&#x20;            └──────────────┬──────────────────┘

&#x20;                           │

&#x20;                      MySQL Database

```



\---



\## 📂 Project Structure



```text

secure-carpooling-system/

│

├── frontend/

│   ├── index.html

│   ├── login.html

│   ├── register.html

│   ├── dashboard.html

│   ├── find-ride.html

│   ├── offer-ride.html

│   ├── my-bookings.html

│   ├── my-profile.html

│   ├── style.css

│   └── script.js

│

├── backend/

│   ├── src/

│   │   └── main/

│   │       ├── java/

│   │       └── resources/

│   │

│   ├── pom.xml

│   ├── mvnw

│   └── mvnw.cmd

│

├── .gitignore

└── README.md

```



\---



\## 🔗 Main API Endpoints



\### 👤 User APIs



| Method | Endpoint              | Description         |

| ------ | --------------------- | ------------------- |

| POST   | `/api/users/register` | Register a new user |

| POST   | `/api/users/login`    | Authenticate a user |



\### 🚗 Ride APIs



| Method | Endpoint                                                                                 | Description                    |

| ------ | ---------------------------------------------------------------------------------------- | ------------------------------ |

| POST   | `/api/rides`                                                                             | Create a new ride              |

| GET    | `/api/rides`                                                                             | Get all available rides        |

| GET    | `/api/rides/search`                                                                      | Search rides                   |

| GET    | `/api/rides/search?startLocation=Vijayawada\&destination=Hyderabad\&travelDate=2026-08-25` | Search rides by route and date |



\### 🎫 Booking APIs



| Method | Endpoint                                | Description                  |

| ------ | --------------------------------------- | ---------------------------- |

| POST   | `/api/bookings`                         | Create a ride booking        |

| GET    | `/api/bookings/passenger/{passengerId}` | Get bookings for a passenger |



\---



\## 🗄️ Database



The application uses \*\*MySQL\*\* with a database named:



```text

secure\_carpooling

```



The database contains entities for managing:



\* Users

\* Rides

\* Bookings

\* Vehicles



The relationships between users, rides, and bookings are managed using \*\*JPA/Hibernate relationships and foreign keys\*\*.



\---



\## 🔐 Security



User passwords are not stored as plain text.



The application uses \*\*BCryptPasswordEncoder\*\* to hash passwords before storing them in the database.



Database credentials are configured using an environment variable rather than committing the actual database password to GitHub.



Example:



```properties

spring.datasource.password=${DB\_PASSWORD}

```



Before running the backend locally, configure:



```powershell

$env:DB\_PASSWORD="YOUR\_MYSQL\_PASSWORD"

```



> Never commit real database passwords, API keys, or other secrets to GitHub.



\---



\## ▶️ How to Run the Project



\### 1. Clone the Repository



```bash

git clone https://github.com/sreedevi8520/secure-carpooling-system.git

```



\### 2. Open the Backend



```bash

cd secure-carpooling-system/backend

```



\### 3. Configure MySQL



Create the database:



```sql

CREATE DATABASE secure\_carpooling;

```



Make sure MySQL Server is running.



\### 4. Configure Database Password



PowerShell:



```powershell

$env:DB\_PASSWORD="YOUR\_MYSQL\_PASSWORD"

```



\### 5. Start Spring Boot Backend



On Windows:



```powershell

.\\mvnw.cmd spring-boot:run

```



The backend runs on:



```text

http://localhost:8080

```



\### 6. Open the Frontend



Open:



```text

frontend/index.html

```



in a browser.



For a local development server, you can also use VS Code Live Server.



\---



\## 🧪 Example Booking Request



```json

{

&#x20; "rideId": 2,

&#x20; "passengerId": 1,

&#x20; "seatsBooked": 1

}

```



Endpoint:



```text

POST http://localhost:8080/api/bookings

```



\---



\## 📸 Application Modules



The application includes the following major pages:



\* 🏠 Home

\* 🔐 Login

\* 📝 Registration

\* 📊 Dashboard

\* 🔎 Find a Ride

\* 🚗 Offer a Ride

\* 🎫 My Bookings

\* 👤 My Profile



\---



\## 🚀 Future Enhancements



The following features can be added in future versions:



\* JWT-based authentication

\* Role-based access control

\* Driver and passenger dashboards

\* Ride cancellation

\* Online payment integration

\* Real-time ride tracking

\* Google Maps integration

\* Ride ratings and reviews

\* Email/SMS notifications

\* Advanced search and filtering

\* Admin dashboard

\* Deployment using cloud platforms



\---



\## 🎯 Learning Outcomes



This project demonstrates practical experience with:



\* Java programming

\* Spring Boot application development

\* REST API development

\* Spring Data JPA

\* Hibernate ORM

\* MySQL database integration

\* Frontend-backend integration

\* Password hashing

\* Git and GitHub

\* API testing

\* CRUD operations

\* Relational database design



\---



\## 👩‍💻 Author



\*\*Kunapalli Sai Sridevi\*\*



B.Tech — Computer Science



GitHub: https://github.com/sreedevi8520



LinkedIn: https://www.linkedin.com/in/kunapalli-sai-sridevi-53300b348



\---



\## ⭐ Project



If you find this project useful, consider giving the repository a ⭐ on GitHub.



