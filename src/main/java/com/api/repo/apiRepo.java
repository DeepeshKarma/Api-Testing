package com.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.model.apiEntity;

public interface apiRepo extends JpaRepository<apiEntity, Integer>  {	

	
}
