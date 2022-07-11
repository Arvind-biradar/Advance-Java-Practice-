package com;
import javax.persistence.*;


@Entity
@Table(name="newuser")
public class NewUser {

	
	
	
	@Column(name="user")
	private String user;
	
	@Column(name="password")
	private int password;
	 @Id
	@Column(name="mobile")
	private int mobile;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

		
	
}