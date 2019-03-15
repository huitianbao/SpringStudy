package com.jdbc;

import java.util.List;

import javax.activation.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.entity.User;
import com.entity.rowMapper.QueryByIdRowMapper;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCTemplateDemo1 {


	
	
	
	// 修改
	public void update() {
		
//		ComboPooledDataSource dataSource=new ComboPooledDataSource();
//		dataSource.setDriverClass("com.mysql.jdbc.Driver");
//		dataSource.setJdbcUrl("jdbc:mysql://localhost:3307/spring?useUnicode=true&amp;characterEncoding=UTF-8");
//		dataSource.setUser("root");
//		dataSource.setPassword("123456");
		
		
		// 1 set DB information
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource
				.setUrl("jdbc:mysql://localhost:3307/spring?useUnicode=true&amp;characterEncoding=UTF-8");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");

		// create jdbcTemplate Object
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sqlString = "update user set username=? where id=?";
		int raw = jdbcTemplate.update(sqlString, "惠天宝", 3);
		System.err.println(raw);
	}

	// 增加
	public void add() {
		// 1 set DB information
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource
				.setUrl("jdbc:mysql://localhost:3307/spring?useUnicode=true&amp;characterEncoding=UTF-8");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");

		// create jdbcTemplate Object
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		// Sql
		String sqlString = "insert into user values(?,?)";
		int rows = jdbcTemplate.update(sqlString, 4, "h2");
		System.out.println(rows);
	}

	// 根据 ID 删除
	public void deleteById(int id) {
		// 1 set DB information
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource
				.setUrl("jdbc:mysql://localhost:3307/spring?useUnicode=true&amp;characterEncoding=UTF-8");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");

		// create jdbcTemplate Object
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		// Sql
		String sqlString = "delete from user where id=?";
		int rows = jdbcTemplate.update(sqlString, id);
		System.out.println(rows);
	}

	public int queryTotalCount() {
		// 1 set DB information
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource
				.setUrl("jdbc:mysql://localhost:3307/spring?useUnicode=true&amp;characterEncoding=UTF-8");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");

		// create jdbcTemplate Object
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		// Sql

		String sqlString = "select count(*) from user";
		int count = jdbcTemplate.queryForObject(sqlString, Integer.class);
		return count;
	}

	public User queryById(int id) {
		// 1 set DB information
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource
				.setUrl("jdbc:mysql://localhost:3307/spring?useUnicode=true&amp;characterEncoding=UTF-8");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");

		try {
			// create jdbcTemplate Object
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			// Sql
			String sqlString = "select * from user where id=?";
			User user = jdbcTemplate.queryForObject(sqlString,
					new QueryByIdRowMapper(), id);
			return user;

		} catch (EmptyResultDataAccessException e) {
			// TODO: handle exception
			System.out.println("id :" + id + "  查询失败，数据库中无此类数据");
			return null;

		}

	}

	public List getAll() {
		// 1 set DB information
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource
				.setUrl("jdbc:mysql://localhost:3307/spring?useUnicode=true&amp;characterEncoding=UTF-8");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");

		// create jdbcTemplate Object
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		// Sql
		String sqlString = "select * from user";
		try {
			List<User> list = jdbcTemplate.query(sqlString,
					new QueryByIdRowMapper());
			return list;

		} catch (EmptyResultDataAccessException e) {
			// TODO: handle exception
			System.out.println("数据库为空");
			return null;

		}

	}
}
