package com.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;
import com.app.servicei.EmployeeServiceI;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceI esi;
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee e){
		
		    Employee emp=esi.addEmployee(e);
		return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/log/{username}/{password}")
	public ResponseEntity<Employee> getdata(@PathVariable("username") String username,@PathVariable("password") String password) {
		
		     Employee e=esi.getData(username,password);
		return new ResponseEntity<Employee>(e,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getSingledata(@PathVariable("id") int id) {
		
		     Employee e=esi.getSingleData(id);
		return new ResponseEntity<Employee>(e,HttpStatus.ACCEPTED);
	}
	
	
	@PutMapping("/edit") 
	public ResponseEntity<Employee> editEmployee(@RequestBody Employee e){
		
		    Employee emp=esi.editEmployee(e);
		return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/delete/{id}") 
	public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") int id){
		
		    Employee emp=esi.deleteEmployee(id);
		return new ResponseEntity<Employee>(emp,HttpStatus.ACCEPTED);
		
	}
	
	public void m2() {
		
		
	}
}
