package com.ecore.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecore.desafio.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	public Role findByName(String name);
}
