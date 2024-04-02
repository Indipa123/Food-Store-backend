# Microservices-based Health Management System

This is a microservices-based Health Management System, a web application built in Java that enables users to interact with doctors, book appointments, manage patient information, and provide reviews. The system has been modularized into microservices for enhanced scalability and flexibility.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies](#technologies)
- [Setup](#setup)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This Health Management System has been transformed into a microservices architecture to improve maintainability and scalability. It offers multiple microservices, including medicine buying, clinic search, and surgery booking.

## Features

### Doctor Microservice

- **Add Doctor**: Users can add new doctors to the system, including details such as name, qualifications, specializations, experience, and descriptions.

- **Search Doctors**: A search functionality allows users to find doctors based on keywords matching their name or specializations.

### Patient Microservice

- **Add Patient**: Users can add patient information, including name, disease, and age.

- **View All Patients**: View a list of all patients in the system.

### Booking Microservice

- **Book Appointments**: Users can book appointments with doctors, providing the doctor's ID, patient ID, and booking time.

### Review Microservice

- **Create Reviews**: Users can leave reviews for doctors, including ratings.

- **Retrieve Reviews**: Retrieve reviews for a specific doctor and calculate the average rating percentage.

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- MySQL Database
- Lombok
- Maven

## Setup

1. **Clone the Microservices Repositories**:

   Clone the individual microservices repositories to your local machine. For example:

   ```bash
   git clone https://github.com/alokdey07/Practo_Microservice.git
   
   ```

2. **Create MySQL Databases**:

   Create separate MySQL databases for each microservice and update the database configuration in their respective `application.properties` files.

3. **Build and Run Microservices**:

   For each microservice, build the project using Maven and run the application. For example:

   ```bash
   cd doctor-service
   mvn clean install
   mvn spring-boot:run
   ```

   Repeat this process for all microservices.

## Usage

The microservices-based Health Management System is accessible at the following endpoints for each microservice:

- **Doctor Microservice**: http://localhost:8080/api/doctors
- **Patient Microservice**: http://localhost:8081/api/patients
- **Booking Microservice**: http://localhost:8082/api/bookings
- **Review Microservice**: http://localhost:8083/api/reviews

You can use these endpoints to interact with the system, add doctors, patients, book appointments, and leave reviews.

## Contributing

If you'd like to contribute to this microservices-based project, please follow these steps:

1. **Fork the respective microservices repositories**.

2. **Create a new branch for your feature or bug fix**.

3. **Make your changes and commit them**.

4. **Push your changes to your fork**.

5. **Create a pull request to the main repositories**.

## License

This project and its microservices are licensed under the MIT License. See the LICENSE file in each repository for details.

Feel free to reach out if you have any questions or need further assistance.
"# order-control-system-backend" 
"# new" 
