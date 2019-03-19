package com.sample.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sample.web.model.Doctor;
import com.sample.web.model.User;
import com.sample.web.service.DoctorService;
import com.sample.web.service.UserService;

@Controller
public class DoctorController {

	@Autowired
	public DoctorService doctorService;
	
	@RequestMapping(value = "/doctorInfo", method = RequestMethod.GET)
	public ModelAndView showRegistration(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mav= new ModelAndView("doctorInfo");
		mav.addObject("doctor", new Doctor());
		return mav;
	}
	
	 @RequestMapping(value = "/saveDoctor", method = RequestMethod.POST)
	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("doctor") Doctor doctor) {
	  System.out.println("Saving the doctor.. ");	 
	  doctorService.registerDoc(doctor);
	  return new ModelAndView("welcome_doc", "doc_name", doctor.getDoc_name());
	  }
	
	
	
}
