package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.apiEntity;
import com.api.service.apiService;

@RestController
@RequestMapping("/api")
public class apiController {
	
	@Autowired
	private apiService service;
	
	@GetMapping("/allapi")
	public List<apiEntity> getAllApi() {
		return service.getAllApi();
	}
	
	@GetMapping("/{id}")
	public apiEntity getApi(@PathVariable int id) {
		return service.getApiById(id);
	}
	
	@PostMapping
	public apiEntity addApi(@RequestBody apiEntity apiEntity) {		
		return service.saveApi(apiEntity);
	}
	
	@PutMapping("/{id}")
	public apiEntity updateApi(@PathVariable int id, @RequestBody apiEntity apiEntity) {
		return service.updateApi(id, apiEntity);
	}
	
	@DeleteMapping("/{id}")
	public String deleteApi(@PathVariable int id) {
		service.deleteApi(id);
		return "APi Deleted Successfuly";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
