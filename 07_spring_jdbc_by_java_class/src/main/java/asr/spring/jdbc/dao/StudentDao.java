package asr.spring.jdbc.dao;

import java.sql.ResultSet;
import java.util.List;

import asr.spring.jdbc.entity.Student;

public interface StudentDao {
	
	int saveStudent(Student student);
	Student getStudent(int studentId);

}
