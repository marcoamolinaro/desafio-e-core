package com.ecore.desafio.dto;

public class PredefinedRole {
	private Long Id;
	private String name;

	public PredefinedRole() {}

	public PredefinedRole(Long id, String name) {
		Id = id;
		this.name = name;
	}
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
