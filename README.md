# Spring-Boot-Core-Components-Assignment
This Project is a Simple Spring Boot Application for managing students and updating their scores.

## Prerequisites
- Java 17
- Maven
 
## Getting Started
1. Clone the repository:
git clone https://github.com/PaviG128/Spring-Boot-Core-Components-Assignment.git
  
2. Navigate to the project directory:
cd spring-boot-school-management
 
3. Build the project:
mvn clean install
 
4. Run the application
java -jar target/boot-core(1).jar
   
5. Access the application in the browser:
http://localhost:8080
 
## Features
- Add a new student
- Fetch all students
- Fetch student by ID
- Update a student's score
- Delete a student
- Scoring system:
  - Below Average: Score < 50
  - Average: 50 <= Score <= 75
  - Above Average: Score > 75
 
## Logging
- Initialization message: "StudentService has been initiated."
- Destruction message: "StudentService is being destroyed."
- Scoring system logs for each student update.
