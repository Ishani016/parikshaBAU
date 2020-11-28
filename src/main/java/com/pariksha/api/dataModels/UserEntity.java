package com.pariksha.api.dataModels;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@Entity(name="user")
public class UserEntity implements Serializable {
	
	@Id
	Integer userId;
	String userName;
	String password;
	boolean isStudent;
	boolean isTeacher;
	
	public String getPassword() {
		return password;
	}
	
	public Integer getUserId() {
		return userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public boolean getIsStudent() {
		return isStudent;
	}
	
	public boolean getIsTeacher() {
		return isTeacher;
	}
	
	public void setIsStudent(Boolean isStudent) {
		this.isStudent = isStudent;
	}
	
	public void setIsTeacher(Boolean isTeacher) {
		this.isTeacher = isTeacher;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
