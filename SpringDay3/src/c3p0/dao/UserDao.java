package c3p0.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void add(){
		String sqlString="insert into user values(?,?)";
		int raw=jdbcTemplate.update(sqlString, 6,"บวบว");
		
		
	}

}
