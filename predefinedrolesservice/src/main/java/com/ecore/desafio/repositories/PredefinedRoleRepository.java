package com.ecore.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecore.desafio.model.PredefinedRole;

public interface PredefinedRoleRepository extends JpaRepository<PredefinedRole, Long> {

	public PredefinedRole findByName(String name);
}
