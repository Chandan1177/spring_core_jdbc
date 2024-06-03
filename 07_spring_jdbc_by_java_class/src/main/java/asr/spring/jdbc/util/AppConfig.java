package asr.spring.jdbc.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {

	@Bean
	public DataSource dataSource() throws IOException {

		Properties properties = new Properties();
        Resource resource = new ClassPathResource("database.properties");
        properties = PropertiesLoaderUtils.loadProperties(resource);

		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName(properties.getProperty("db.driverClassName"));
		ds.setUrl(properties.getProperty("db.url"));
		ds.setUsername(properties.getProperty("db.username"));
		ds.setPassword(properties.getProperty("db.password"));
		return ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		JdbcTemplate template = new JdbcTemplate(dataSource);
		return template;
	}

}
