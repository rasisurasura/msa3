
package com.mindtree.empdept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.empdept.entity.Employee;
import com.mindtree.empdept.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;
	@GetMapping
	private List<Employee>getAll(){
		return employeeservice.getAll();
	}
	@GetMapping("/{id}")
	private Employee getById(@PathVariable Long id) {
		return employeeservice.getById(id);
	}
	@PostMapping
	private Employee add(@RequestBody Employee employee) {
		return employeeservice.addOrUpdate(employee);
	}
	@PutMapping("/{id}")
	private Employee update(@PathVariable Long id, @RequestBody Employee employee) {
		employee.setId(id);
		return employeeservice.addOrUpdate(employee);
	}
	@DeleteMapping("/{id}")
	private void delete(@PathVariable Long id) {
		employeeservice.deleteById(id);
	}

}
