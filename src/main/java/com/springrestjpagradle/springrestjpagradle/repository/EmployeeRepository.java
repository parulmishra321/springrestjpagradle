package com.springrestjpagradle.springrestjpagradle.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springrestjpagradle.springrestjpagradle.entities.Employees;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees, Integer>{

}
