package com.springrestjpagradle.springrestjpagradle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
		catch(Exception e) {
			e.getMessage();
		}
		
		return new ReponseEntity<List<Employees>>(employees, HttpStatus.OK);
		
	}

}
