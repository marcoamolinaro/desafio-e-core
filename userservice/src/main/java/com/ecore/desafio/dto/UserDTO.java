package com.ecore.desafio.dto;

public class UserDTO {

	private String id;
	private String displayName;
	
	public UserDTO() {}

	public UserDTO(String id, String displayName) {
		this.id = id;
		this.displayName = displayName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
}
