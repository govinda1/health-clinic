package com.sample.web.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sample.web.model.Doctor;

public class DoctorDaoImpl implements DoctorDao {
	
	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void registerDoc(Doctor doctor) {
		
		
		String sql = "insert into doctor values(?,?,?,?,?,?,?,?)";
		
		jdbcTemplate.update(sql, new Object[] { doctor.getDoc_id(), doctor.getDoc_name(), doctor.getDoc_degree(),
							doctor.getDoc_speciality(), doctor.getDoc_city(), doctor.getDoc_state(), doctor.getDoc_ph(), doctor.getDoc_email()  });     
		
	}
	
	

}
