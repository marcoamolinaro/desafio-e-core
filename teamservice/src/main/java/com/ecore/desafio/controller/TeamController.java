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

import com.ecore.desafio.dto.TeamDTO;

@RestController
@RequestMapping("/ecore")
@ResponseBody
public class TeamController {

	@GetMapping("/teams")
	public List<TeamDTO> getAllUsers() {
		String uri = "https://cgjresszgg.execute-api.eu-west-1.amazonaws.com/teams";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<TeamDTO[]> response =
				  restTemplate.getForEntity(
				  uri,
				  TeamDTO[].class);
		TeamDTO[] teams = response.getBody();
		return Arrays.asList(teams);
	}
	
	
	@GetMapping("/teams/{id}")
	public TeamDTO getUser(@PathVariable String id) {
		String uri = "https://cgjresszgg.execute-api.eu-west-1.amazonaws.com/teams/" + id;
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<TeamDTO> response =
				  restTemplate.getForEntity(
				  uri,
				  TeamDTO.class);
		TeamDTO team = response.getBody();
		return team;
	}
}
