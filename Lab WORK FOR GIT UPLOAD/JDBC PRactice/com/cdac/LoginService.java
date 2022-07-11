package com.cdac;

public class LoginService {

	boolean checkLogin(String user,String pass) {
		if(user.equals("Arvind")&& pass.equals("12345")) {
			return true;
		}else
			return false;
	}

}
