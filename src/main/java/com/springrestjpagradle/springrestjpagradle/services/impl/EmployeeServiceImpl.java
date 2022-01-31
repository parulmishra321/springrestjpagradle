package com.springrestjpagradle.springrestjpagradle.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestjpagradle.springrestjpagradle.entities.Employees;
import com.springrestjpagradle.springrestjpagradle.repository.EmployeeRepository;
import com.springrestjpagradle.springrestjpagradle.services.EmployeeServices;

@Service 
public class EmployeeServiceImpl implements EmployeeServices {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employees> getAllEmployees() {
		
		return (List<Employees>) employeeRepository.findAll();
	}

	@Override
	public Employees getEmployeeById(int employeeId) {
		
		return employeeRepository.findById(employeeId).orElse(null);
	}

	@Override
	public Employees addOrUpdateEmployee(Employees employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employees deleteEmployee(int employeeId) throws Exception {
		
		Employees deletedEmployee = null;
		try {
			deletedEmployee = employeeRepository.findById(employeeId).orElse(null);
			if(deletedEmployee ==null) {
				throw new Exception("Employee not available!");
				}
			else{
				 employeeRepository.deleteById(employeeId);
				}
			}
			catch(Exception e) {
				throw e;
			}
			return deletedEmployee;
	}
}
