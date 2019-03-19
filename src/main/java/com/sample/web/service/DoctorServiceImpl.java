package com.sample.web.service;

import com.sample.web.dao.DoctorDao;
import com.sample.web.model.Doctor;

import org.springframework.beans.factory.annotation.Autowired;

public class DoctorServiceImpl implements DoctorService {
	
	  @Autowired
	  public DoctorDao doctorDao;

	  public void registerDoc(Doctor doctor) {
	    doctorDao.registerDoc(doctor);
	  }


}
