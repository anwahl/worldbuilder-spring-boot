package com.wahlhalla.worldbuilder.security.payload.request;

public class PasswordChangeRequest {
    
    private String username;

	private String oldPassword;

	private String newPassword;

	private String token;


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
    
	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
