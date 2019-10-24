package com.app.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
//JPA
@Entity
@Table(name="usrtab")
public class User {
	@Id
	@GeneratedValue
	@Column(name="uid")
	private int userId;
	
	@Column(name="uname")
	private String userName;
	@Column(name="email")
	private String userEmail;
	@Column(name="pwd")
	private String userPwd;
	@ElementCollection(fetch=FetchType.EAGER) 
	@CollectionTable(name="rolestab",
		joinColumns=@JoinColumn(name="uid")
	)
	@Column(name="role")
	private Set<String> roles;
	public User() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public Set<String> getRoles() {
		return roles;
	}
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPwd=" + userPwd
				+ ", roles=" + roles + "]";
	}
	
}
