package com.java.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Long>{

}
