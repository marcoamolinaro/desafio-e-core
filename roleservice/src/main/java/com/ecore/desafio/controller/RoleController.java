package com.ecore.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecore.desafio.dto.PredefinedRole;
import com.ecore.desafio.model.Role;
import com.ecore.desafio.services.RoleService;

@RestController
@RequestMapping("/ecore")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${predefinedrolesservice.url}")
	private String predefinedRolesServiceUrl;
	
	@GetMapping("/roles")
	public List<Role> getAllRoles() {
		return roleService.getAllRoles();
	}
	
	@GetMapping("/roles/{name}") 
	public Role getRoleByName(@PathVariable String name) {
		return roleService.findByName(name);
	}
	
	@PutMapping("/roles/save") 
	public Role saveRole(@RequestBody Role role) {
		PredefinedRole predefinedRole = restTemplate.getForObject(predefinedRolesServiceUrl+role.getName(), PredefinedRole.class);

		if (predefinedRole != null) {
			throw new RuntimeException("This Role " + role.getName() + " already exist as predefined role!");
		}
		
		return roleService.save(role);
	}
}
