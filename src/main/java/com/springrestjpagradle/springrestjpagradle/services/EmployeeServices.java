package com.springrestjpagradle.springrestjpagradle.services;

import java.util.List;

import com.springrestjpagradle.springrestjpagradle.entities.Employees;

public interface EmployeeServices {
	
	public List<Employees> getAllEmployees();
	public Employees getEmployeeById(int employeeId);
	public Employees addOrUpdateEmployee(Employees employee);
	public Employees deleteEmployee(int employeeId) throws Exception;
}
