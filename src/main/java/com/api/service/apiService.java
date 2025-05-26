package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.model.apiEntity;
import com.api.repo.apiRepo;

@Service
public class apiService {
	@Autowired
	private apiRepo repo;
	
	public List<apiEntity> getAllApi() {
		return repo.findAll();
	}
	
	public apiEntity getApiById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public apiEntity saveApi(apiEntity apiEntity) {
		return repo.save(apiEntity);
	}
	
	public apiEntity updateApi(int id, apiEntity apiEntity) {
		apiEntity existing = getApiById(id);
		if(existing != null) {
			existing.setName(apiEntity.getName());
			existing.setEmail(apiEntity.getEmail());
			return repo.save(existing);
		}
		return null;
	}
	
	public void deleteApi(int id) {
		repo.deleteById(id);
	}

}
