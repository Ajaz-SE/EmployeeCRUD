package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {

	//Injecting EmployeeService Object to use its methods
	@Autowired
	private EmployeeService employeeService;
	
	//Handler method to add the Employee
	@PostMapping("/register")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
		}
	
	//Handler to delete Employee by ID
	@DeleteMapping("{id}")
	public void deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
	   }
	
	//Handler to fetch user by ID
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return employeeService.getEmployee(id);
	}
	
	//Handler to fetch all the Employees from Database
	 @PostMapping("/getAllEmployees")
	   public List<Employee> getAllgetEmployees() {
	       return employeeService.getAllEmployee();
	   }
	 
	 //Update Employee
	 @PutMapping("/updateEmployee")
	 public Employee updateEmployee(@RequestBody Employee e) {
		return employeeService.updateEmployee(e);
		 
	 }
}
