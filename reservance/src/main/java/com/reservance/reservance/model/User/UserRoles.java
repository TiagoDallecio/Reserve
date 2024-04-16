package com.reservance.reservance.model.User;

public enum UserRoles {

	ADMIN("ADMIN"),
	
	USER("USER"),
	
	RESTAURANT("RESTAURANT");
	
	private String role;
	
	UserRoles(String role) {
		this.role = role;
	}
	
	public String getRole() {
		return role;
	}
}
