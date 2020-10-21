package com.demo.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.Entity.Emp;
import com.demo.spring.data.EmpDb;
@CrossOrigin
@RestController
public class EmpRestController {
	@Autowired
	private EmpDb dataStore;
	
	
	@RequestMapping(path="/emp/find/{id}", method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity getEmpDetails(@PathVariable("id")int empId) {
		
		if(dataStore.getDb().containsKey(empId)) {
			return ResponseEntity.ok(dataStore.getDb().get(empId));
		}
		else
		{
			return ResponseEntity.ok("Emp not found");
		}
	}
	
	@GetMapping(path="/emp",produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<List<Emp>> listAll(){
		
		ArrayList<Emp> empList=new ArrayList<>(dataStore.getDb().values());
		return ResponseEntity.ok(empList);
		
	}
	
	@PostMapping(path="/emp/save", produces=MediaType.TEXT_PLAIN_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveEmp(@RequestBody Emp e){
		if(EmpDb.getDb().containsKey(e.getEmpId())) {
			return ResponseEntity.ok("Emp Exists");
		}
			
			else {
				EmpDb.getDb().put(e.getEmpId(), e);
				return  ResponseEntity.ok("Emp saved successfully");
			}
		
	}
	
	@PutMapping(path="/emp/update", produces=MediaType.TEXT_PLAIN_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateEmp(@RequestBody Emp e){
		if(EmpDb.getDb().containsKey(e.getEmpId())) {
			EmpDb.getDb().put(e.getEmpId(), e);
			return ResponseEntity.ok("Emp data updated");
			
		}
			else {		
				//return  ResponseEntity.ok("Emp not found");    ok=200
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Emp not found");
			}
		
	}
	
	@DeleteMapping(path="/emp/delete", produces=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> updateEmp(@RequestParam("empId") int id){
		if(EmpDb.getDb().containsKey(id)) {
			EmpDb.getDb().remove(id);
			return ResponseEntity.ok("Emp deleted");
			
		}
			else {		
				//return  ResponseEntity.ok("Emp not found");    ok=200
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Emp not found");
			}
		
	}
	
	
}
