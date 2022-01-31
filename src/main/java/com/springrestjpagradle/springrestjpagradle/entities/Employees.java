package com.springrestjpagradle.springrestjpagradle.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="employee_id")
	private int employee_id;
	
	@Column(name="employee_name")
	private String employee_name;
	
	@Column(name="employee_salary")
	private float employee_salary;

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int employee_id, String employee_name, float employee_salary) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public float getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(float employee_salary) {
		this.employee_salary = employee_salary;
	}

	@Override
	public String toString() {
		return "Employees [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_salary="
				+ employee_salary + "]";
	}
	
	
	
	
}
