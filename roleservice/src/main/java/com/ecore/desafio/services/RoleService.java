package com.ecore.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecore.desafio.model.Role;
import com.ecore.desafio.repositories.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}
	
	public Role save(Role role) {
		return roleRepository.save(role);
	}
	
	public Role findByName(String name) {
		return roleRepository.findByName(name);
	}
}
