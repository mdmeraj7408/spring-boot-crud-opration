package com.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.entity.Department;
import com.java.service.DepartmentServices;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentServices dept;
	@PostMapping("/save")
	public Department saveDepartment( @RequestBody Department department)
	{
		return dept.saveDepartment(department);
	}
	@GetMapping("/departments")
   public List<Department> getDepartment()
   {
	   return dept.fetchDepartmentList();
   }
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@RequestBody Department  department,@PathVariable("id") Long id) {
        return  dept.upadateDepartment(department, id);	
	}
	
	@DeleteMapping("/departments/{id}")
	public String deleteDepartment(@RequestBody Department  department,@PathVariable("id") Long id) {
           dept.delateDepartmentById(id);
		return  "SuccessFully Deleted.....";	
	}
}
