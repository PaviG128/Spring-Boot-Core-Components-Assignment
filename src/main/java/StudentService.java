package com.example.bootcore;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentService implements InitializingBean, DisposableBean {
	private static final Logger logger = LoggerFactory.getLogger(StudentService.class);
    private List<Student> studentList;
 
    public StudentService() {
        this.studentList = new ArrayList<>();
    }
 
    public void addStudent(Student student) {
        studentList.add(student);
    }
 
    public List<Student> getAllStudents() {
        return studentList;
    }
 
    public Student getStudentById(int id) {
        // Implement logic to fetch a student by ID
    	for (Student student : studentList) {
    		if (student.getId() == id) {
    			return student;
    		}
    	}
        return null;
    }
 
    public void updateStudentScore(int id, int newScore) {
        // Implement logic to update a student's score
    	for(Student student : studentList) {
    		if(student.getId() == id) {
    			student.setScore(newScore);
    			logScoreMessage(newScore);
    			break;
    		}
    	}
    }
 
    public void deleteStudent(int id) {
        // Implement logic to delete a student
    	Iterator<Student> iterator = studentList.iterator();
    	while (iterator.hasNext()) {
    		Student student = iterator.next();
    		if (student.getId() == id) {
    			iterator.remove();
    			break;
    		}
    	}
     	
    }
 
    private void logScoreMessage(int newscore) {
        if (newscore < 50) {
            logger.info("Student Score is Below Average");
        } else if (newscore >= 50 && newscore <= 75) {
            logger.info("Student Score is Average");
        } else {
            logger.info("Student Score is Above Average");
        }
    }
 
    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("StudentService has been initiated.");
    }
 
    @Override
    public void destroy() throws Exception {
        logger.info("StudentService is being destroyed.");
    }
}