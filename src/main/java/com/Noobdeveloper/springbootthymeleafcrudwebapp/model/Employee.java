package com.Noobdeveloper.springbootthymeleafcrudwebapp.model;

import javax.persistence.*;

@Entity 
@Table(name = "employees")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Column (name = "first_name")
    private String FirstName;
	
	@Column (name = "last_name")
    private String LastName;
	
	@Column (name = "email")
     private String email;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    

}
