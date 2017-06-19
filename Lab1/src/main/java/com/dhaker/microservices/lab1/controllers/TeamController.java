package com.dhaker.microservices.lab1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhaker.microservices.lab1.entities.Team;
import com.dhaker.microservices.lab1.repositories.TeamRepository;

public class TeamController {
	
	@Autowired
	TeamRepository 	teamRepository;
	
	@RequestMapping("/teams")
	public Iterable<Team> getTeams() {
	  	return teamRepository.findAll();
	}
	
	@RequestMapping("/teams/{id}")
	public Team getTeam(@PathVariable Long id){
		return teamRepository.findOne(id);		
	}

}
