package com.ecore.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecore.desafio.model.PredefinedRole;
import com.ecore.desafio.services.PredefinedRoleService;

@RestController
@RequestMapping("/ecore")
public class PredefinedRoleController {
	@Autowired
	private PredefinedRoleService predefinedRoleService;

	@GetMapping("/predefinedroles")
	public List<PredefinedRole> getAllPredefinedRoles() {
		return predefinedRoleService.getAllPredefinedRoles();
	}

	@GetMapping("/predefinedroles/{name}")
	public PredefinedRole getAllPredefinedRoleByName(@PathVariable String name) {
		return predefinedRoleService.findByName(name);
	}
	
}
