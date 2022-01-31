package com.springrestjpagradle.springrestjpagradle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrestjpagradle.springrestjpagradle.entities.Employees;
import com.springrestjpagradle.springrestjpagradle.services.EmployeeServices;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeServices employeeServices;
	
	@GetMapping("/allEmployees")
	public ResponseEntity<List<Employees>> getAllEmployees(){
		List<Employees> employees = null;
		try {
			employees = employeeServices.getAllEmployees();
		}
        catch(Exception e){
        	e.getMessage();
		}	
		return new ResponseEntity<List<Employees>>(employees, HttpStatus.OK);	
	}
	
	@GetMapping("/getById{id}")
	public ResponseEntity<Employees> getEmployeeById(@PathVariable("id") int employeeId){
		Employees employees = null;
		try {
			employees = employeeServices.getEmployeeById(employeeId);
		}
        catch(Exception e){
        	e.getMessage();
		}	
		return new ResponseEntity<Employees>(employees, HttpStatus.OK);	
	}
	
	@PostMapping("/addOrUpdate")
	public ResponseEntity<Employees> addOrUpdate(@RequestBody Employees employee){
		Employees employees = null;
		try {
			employees = employeeServices.addOrUpdateEmployee(employee); 
		}
        catch(Exception e){
        	e.getMessage();
		}	
		return new ResponseEntity<Employees>(employees, HttpStatus.OK);	
	}
}
