package asr.spring.jdbc.service;

import asr.spring.jdbc.entity.Student;

public interface StudentService {
	
	String saveStudent(Student student);
	Student getStudent(int studentId);

}
