package asr.spring.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import asr.spring.jdbc.entity.Address;
import asr.spring.jdbc.entity.Student;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Address address=new Address(rs.getString(5), rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9));
		return new Student(rs.getString("name"),rs.getInt("age"),rs.getString("subject").split(","),address);
	}

}
