package com.example.notificationms.dto;

import com.example.notificationms.model.User;

public class UserActionDTO {
    private User user;
    private String action;
    
    public UserActionDTO() {}
    
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
    
    
}
