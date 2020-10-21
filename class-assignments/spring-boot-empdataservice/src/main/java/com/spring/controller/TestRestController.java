package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.data.EmpDb;
import com.spring.data.Emp;

@RestController
public class TestRestController {
	@Autowired
	private EmpDb datastore;
	
	@GetMapping(path="/emp/find/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getEmpDetails(@PathVariable("id")int id) {
		if(datastore.getDb().containsKey(id)) {
			return ResponseEntity.ok(datastore.getDb().get(id));
		}
		else {
			return ResponseEntity.ok("Not Found");
		}
	}
	
	@GetMapping(path="/emp/",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Emp>> listAll() {
		ArrayList <Emp> empList=new ArrayList<>(datastore.getDb().values());
		return ResponseEntity.ok(empList);
	}
}
