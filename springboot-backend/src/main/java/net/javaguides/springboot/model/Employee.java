package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name_Emp")
	private String name_Emp;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "phone")
	private String phone;

	@Column(name = "address")
	private String address;

	@Column(name = "line")
	private String line;

	@Column(name = "slip")
	private String slip;

	
	public Employee() {
		
	}
	
	public Employee(String name_Emp, String username,String password,String phone,String address,String line,String slip) {
		super();
		this.name_Emp = name_Emp;
		this.username = username;
		this.password = password;
		this.line = line;
		this.phone = phone;
		this.address = address;
		this.slip = slip;
	}
	// public long getId() {
	// 	return id;
	// }
	// public void setId(long id) {
	// 	this.id = id;
	// }
	// public String getName_Emp() {
	// 	return name_Emp;
	// }
	// public void setName_Emp(String name_Emp) {
	// 	this.name_Emp = name_Emp;
	// }
	// public String getUsername() {
	// 	return username;
	// }
	// public void setUsername(String username) {
	// 	this.username = username;
	// }
	// public String getPassword() {
	// 	return password;
	// }
	// public void setPassword(String password) {
	// 	this.password = password;
	// }
	// public String getLine() {
	// 	return line;
	// }
	// public void setLine(String line) {
	// 	this.line = line;
	// }
	// public String getPhone() {
	// 	return phone;
	// }
	// public void setPhone(String phone) {
	// 	this.phone = phone;
	// }
	// public String getAddress() {
	// 	return address;
	// }
	// public void setAddress(String address) {
	// 	this.address = address;
	// }
	// public String getSlip() {
	// 	return slip;
	// }
	// public void setSlip(String slip) {
	// 	this.slip = slip;
	// }
}
