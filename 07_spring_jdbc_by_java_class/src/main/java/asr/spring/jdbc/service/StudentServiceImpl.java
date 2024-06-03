package asr.spring.jdbc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import asr.spring.jdbc.dao.StudentDaoImpl;
import asr.spring.jdbc.entity.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDaoImpl dao;
	
	private String message="";
	
	@Override
	public String saveStudent(Student student) {
		return dao.saveStudent(student)>0?"Record insterd successfully... ":"Record not insterd....";
	}

	@Override
	public Student getStudent(int studentId) {
		return dao.getStudent(studentId);
	}

}
