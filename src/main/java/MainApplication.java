package com.example.bootcore;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
import java.util.List;
 
@SpringBootApplication
public class MainApplication {
	
    public static void main(String[] args) {
SpringApplication.run(MainApplication.class, args);
 
        // Demonstrate StudentService usage
        StudentService studentService = new StudentService();
 
        // Add a few students
        studentService.addStudent(new Student(23, "abc", 80 /* provide id, name, score */));
        studentService.addStudent(new Student(24, "xyz", 70 /* provide id, name, score */));
        studentService.addStudent(new Student(25, "pqr", 45/* provide id, name, score */));
        
        // Fetch and display the students
        List<Student> students = studentService.getAllStudents();
        System.out.println("All Students: " + students);
 
        // Update scores and observe the scoring system logs
        studentService.updateStudentScore(1, 40); // Below Average
        studentService.updateStudentScore(2, 60); // Average
        studentService.updateStudentScore(3, 80); // Above Average
 
        // Remove a student
        studentService.deleteStudent(2);
        students = studentService.getAllStudents();
        System.out.println("Updated Students: " + students);
    }
}
