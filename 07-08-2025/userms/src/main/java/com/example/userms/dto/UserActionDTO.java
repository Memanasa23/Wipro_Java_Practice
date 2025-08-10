package com.example.userms.dto;

import com.example.userms.model.User;

public class UserActionDTO {
    private User user;
    private String action;

    public UserActionDTO() {}
    public UserActionDTO(User user, String action) {
        this.user = user;
        this.action = action;
    }
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
