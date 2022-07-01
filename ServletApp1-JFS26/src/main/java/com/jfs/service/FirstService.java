package com.jfs.service;
import com.jfs.dao.*;

public class FirstService {
	
	public boolean isValidUser(String username,String password) {
		return new FirstDAO().validateUser(username, password);
	}
	

}
