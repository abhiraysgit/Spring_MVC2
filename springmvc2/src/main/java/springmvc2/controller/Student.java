package springmvc2.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	private String name;
	private Date date;
	private String emailid;
	private Address address;
	private List<String> courses;
	private String gender;
	private String type;
	private Long id;

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", date=" + date + ", emailid=" + emailid + ", address=" + address
				+ ", courses=" + courses + ", gender=" + gender + ", type=" + type + ", id=" + id + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
