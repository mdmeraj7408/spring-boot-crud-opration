package com.java.service;

import java.util.List;

import com.java.entity.Department;

public interface DepartmentServices {
	 //insert 
     Department saveDepartment(Department department);
     
     //Read 
     List<Department> fetchDepartmentList();
     
     //update
     Department upadateDepartment(Department department,Long departmentId);
     
     //Delete
     void delateDepartmentById(Long departmentId);
}
