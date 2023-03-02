package com.ecore.desafio.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecore.desafio.dto.UserDTO;

@RestController
@RequestMapping("/ecore")
@ResponseBody
public class UserController {

	@GetMapping("/users")
	public List<UserDTO> getAllUsers() {
		String uri = "https://cgjresszgg.execute-api.eu-west-1.amazonaws.com/users";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<UserDTO[]> response =
				  restTemplate.getForEntity(
				  uri,
				  UserDTO[].class);
		UserDTO[] users = response.getBody();
		return Arrays.asList(users);
	}
	
	@GetMapping("/users/{id}")
	public UserDTO getUser(@PathVariable String id) {
		String uri = "https://cgjresszgg.execute-api.eu-west-1.amazonaws.com/users/" + id;
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<UserDTO> response =
				  restTemplate.getForEntity(
				  uri,
				  UserDTO.class);
		UserDTO user = response.getBody();
		return user;
	}
	
}
