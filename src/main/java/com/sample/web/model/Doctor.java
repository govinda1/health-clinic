package com.sample.web.model;

public class Doctor {
	
	private Integer doc_id;
	private String doc_name;
	private String doc_degree;
	private String doc_speciality;
	private String doc_city;
	private String doc_state;
	private String doc_ph;
	private String doc_email;
	

	public Integer getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(Integer doc_id) {
		this.doc_id = doc_id;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
	public String getDoc_degree() {
		return doc_degree;
	}
	public void setDoc_degree(String doc_degree) {
		this.doc_degree = doc_degree;
	}
	public String getDoc_speciality() {
		return doc_speciality;
	}
	public void setDoc_speciality(String doc_speciality) {
		this.doc_speciality = doc_speciality;
	}
	public String getDoc_city() {
		return doc_city;
	}
	public void setDoc_city(String doc_city) {
		this.doc_city = doc_city;
	}
	public String getDoc_state() {
		return doc_state;
	}
	public void setDoc_state(String doc_state) {
		this.doc_state = doc_state;
	}
	public String getDoc_ph() {
		return doc_ph;
	}
	public void setDoc_ph(String doc_ph) {
		this.doc_ph = doc_ph;
	}

	
	//Added new field to the table on 3/13/2019 to introduce email to doctor functionality
	public String getDoc_email() {
		return doc_email;
	}
	public void setDoc_email(String doc_email) {
		this.doc_email = doc_email;
	}
	
	
}
