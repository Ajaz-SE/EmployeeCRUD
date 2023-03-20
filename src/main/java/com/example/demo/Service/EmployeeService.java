package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Entities.Employee;
import com.example.demo.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//method to add employee
	public Employee addEmployee(Employee e) {
		return employeeRepository.save(e) ;
	}
	
	//Delete EMployee on the Basis of ID
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}
	
	//method to get employee by id
	 public Employee getEmployee(Long id) {
	       return employeeRepository.findById(id).orElse(null);
	   }

	 //Method to fetch all the Employees
	   public List<Employee> getAllEmployee() {
	       return employeeRepository.findAll();
	   }


	   //Method to update Employee
	   public Employee updateEmployee(Employee e) {
	       return employeeRepository.save(e);
	   }
}
