package asr.spring.jdbc.config;

import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {
	
	@Bean
	public DataSource dataSource() throws IOException {
		DriverManagerDataSource ds=new DriverManagerDataSource();
	        
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		ds.setUsername("root");
		ds.setPassword("Anish@7425951177");
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		JdbcTemplate template=new JdbcTemplate(dataSource);
		return template;
	}

}
