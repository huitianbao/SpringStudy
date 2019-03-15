package com.entity.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.entity.User;

public class QueryByIdRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int num) throws SQLException {
		
		String username=rs.getString("username");
		int id=rs.getInt("id");
		User user=new User();
		user.setId(id);
		user.setUsername(username);
		
		
		
		return user;
	}

}
