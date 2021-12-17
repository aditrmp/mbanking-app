package com.mbanking.app.userInfo.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAuthRestResponse {
	private String user;
	private String message;
	
	public UserAuthRestResponse(String user, String message) {
		super();
		this.user = user;
		this.message = message;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
