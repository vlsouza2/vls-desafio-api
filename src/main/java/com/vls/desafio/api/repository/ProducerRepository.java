package com.vls.desafio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vls.desafio.api.entity.Producer;

public interface ProducerRepository extends JpaRepository<Producer, Long> {
	
	Producer findByName(String name);
	
}
