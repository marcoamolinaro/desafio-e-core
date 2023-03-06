package com.ecore.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecore.desafio.model.PredefinedRole;
import com.ecore.desafio.repositories.PredefinedRoleRepository;

@Service
public class PredefinedRoleService {

	@Autowired
	private PredefinedRoleRepository predefinedRoleRepository;
	
	public List<PredefinedRole> getAllPredefinedRoles() {
		return predefinedRoleRepository.findAll();
	}

	public PredefinedRole findByName(String name) {
		return predefinedRoleRepository.findByName(name);
	}

}
