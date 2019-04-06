package com.eventregistration.entity;

public class User {
	String name;
	String rc_id;
	String collegeName;
	String contact;
	String year;
	String stream;
	
	
	public User() {
		
	}
	public User(String name, String rc_id, String collegeName, String contact, String year, String stream) {
		this.name = name;
		this.rc_id = rc_id;
		this.collegeName = collegeName;
		this.contact = contact;
		this.year = year;
		this.stream = stream;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRc_id() {
		return rc_id;
	}
	public void setRc_id(String rc_id) {
		this.rc_id = rc_id;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", rc_id=" + rc_id + ", collegeName=" + collegeName + ", contact=" + contact
				+ ", year=" + year + ", stream=" + stream + "]";
	}
	
	
	
	

}
