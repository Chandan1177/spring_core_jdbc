package asr.spring.jdbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import asr.spring.jdbc.entity.Student;
import asr.spring.jdbc.mapper.StudentMapper;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int saveStudent(Student student) {
		String query="INSERT INTO student_tbl (name,age,subject,street,city,zipCode,state,country) VALUE (?,?,?,?,?,?,?,?)";
		int effectedRow = jdbcTemplate.update(query,student.getName(),student.getAge(),String.join(",", student.getSubject()),student.getAddress().getStreet(),
				student.getAddress().getCity(),student.getAddress().getZipCode(),student.getAddress().getState(),student.getAddress().getCountry());
		return effectedRow;
	}

	@Override
	public Student getStudent(int studentId) {
		String query="SELECT * FROM student_tbl where studentId =?";
		List<Student> students = jdbcTemplate.query(query,new Object[]{studentId}, new StudentMapper());
		return students.get(0);
	}
	
}
