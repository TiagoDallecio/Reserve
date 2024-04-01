package com.reservance.reservance.model.User;

public enum UserRoles {

	ADMIN("admin"),
	
	USER("user"),
	
	RESTAURANT("restaurant");
	
	private String role;
	
	UserRoles(String role) {
		this.role = role;
	}
	
	public String getRole() {
		return role;
	}
}
