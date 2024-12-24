# Railway App Backend

This repository contains the backend services for the **Railway App System**, a microservices-based application built to provide seamless railway ticket booking, train information, and customer support, integrated with the corresponding [frontend application](https://github.com/udit-166/Railway-App-Frontend).

---

## Features
1. **User Registration:**  
   - Supports email and SMS-based OTP verification for secure user registration.
2. **Train List:**  
   - Fetch and display train schedules and availability information.
3. **Ticket Booking:**  
   - Enable users to book train tickets in real time.  
4. **Payment System:**  
   - Secure integration for processing payments online.  
5. **Ticket Details:**  
   - Fetch detailed information about user-booked tickets.  
6. **User Profile:**  
   - Manage and update user profiles efficiently.  
7. **Customer Support (Chatbot):**  
   - AI-powered chatbot to address common user queries effectively.

---

## Microservices Overview
This backend application comprises several microservices to promote scalability and modular design:

### 1. User Service
- Manages user authentication, registration, profile updates, and OTP functionalities.

### 2. Train Service
- Handles train-related operations like fetching schedules and availability.

### 3. Hotel Service
- Offers hotel recommendations near train stations.

### 4. Customer Support Service
- Implements a **DNN-based Chatbot** for answering common user queries.  
- Built using **Django** and **Jupyter Framework** to leverage machine learning algorithms.

---

## Additional Services
To enhance the efficiency of the backend system, we use the following supportive services:  
1. **API Gateway:** Facilitates secure and centralized routing of service requests.  
2. **Service Registry (Eureka):** Handles service discovery and registration.  
3. **Config Server:** Manages centralized configurations for all microservices.

---

## Technologies Used
- **Languages and Frameworks:**  
  - Java (Spring Boot) for core backend services.  
  - Python (Django) for the AI-powered Chatbot.

- **Database:**  
  - **MySQL** as the primary relational database for managing data storage.

- **AI and Machine Learning:**  
  - The chatbot leverages **Deep Neural Networks (DNN)** for predictive model training.

---

## Key Advantages
1. **Microservices Architecture:**  
   - Independent and modular service structure for scalability and flexibility.

2. **Technology Integration:**  
   - Utilizes **Spring Boot (Java)** and **Django (Python)** in the same application for domain-specific tasks.

3. **Polyglot Persistence:**  
   - Support for multiple databases ensures optimized storage solutions.

4. **High Security:**  
   - Implements OTP-based verification for secure user authentication and ensures secure payment gateways.

---

## How to Use

### Frontend Integration
The backend integrates seamlessly with the [frontend repository](https://github.com/udit-166/Railway-App-Frontend). Ensure that both repositories are up and running for full application functionality.

### Project Structure
Each microservice has its own branch in the repository:
- **User Service:** `user-service`  
- **Train Service:** `train-service`  
- **Hotel Service:** `hotel-service`  
- **Customer Support Service (Chatbot):** `customer-support-service`  

---

## Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/udit-166/Railway-App-Backend.git
