# Employee Management System with Microservice Architecture
 Graduation Project for Bogazici University - MSc Software Engineering
 
 Project Advisor: PhD Suzan Üsküdarlı https://www.cmpe.boun.edu.tr/~uskudarli/
 
 # List of Services
 
 config-service is responsible to serve the spring configuration to every service.
 
 registry-service is responsible for the registration and discovery of the other services.
 
 gateway-service is responsible to map the incoming requests to specific microservice.
 
 auth-service is responsible to create users, authenticate them, store their tokens/refresh tokens and revoke it if needed.
 
 
