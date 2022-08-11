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

import com.mindtree.empdept.entity.Department;
import com.mindtree.empdept.service.DepartmentService;


	@RestController
	@RequestMapping("/department")
	public class DepartmentController {
	@Autowired
	private DepartmentService departmentservice;

	@GetMapping
	private List<Department> getAll(){
		return departmentservice.getAll();
	}

	@GetMapping("/{id}")
	private Department getById(@PathVariable Long id) {
		return departmentservice.getById(id);
	}
	@PostMapping
	private Department add(@RequestBody Department department) {
		return departmentservice.addOrUpdate(department);
	}
	@PutMapping("/{id}")
	private Department update(@PathVariable Long id, @RequestBody Department department) {
		department.setId(id);
		return departmentservice.addOrUpdate(department);
	}
	@DeleteMapping("/{id}")
	private void delete(@PathVariable Long id) {
		departmentservice.deleteById(id);
	}
	}


