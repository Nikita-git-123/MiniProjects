package com.example.bean;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements BookDao {
	
	private JdbcTemplate jdbcTemplate;
	
	

	public BookDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	@Override
	public void saveBook(int id, String name, Double price) {
		
		String sql = "insert into books values(?,?,?)";
		jdbcTemplate.update(sql, ps -> {
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3, price);
		});
	}

}
