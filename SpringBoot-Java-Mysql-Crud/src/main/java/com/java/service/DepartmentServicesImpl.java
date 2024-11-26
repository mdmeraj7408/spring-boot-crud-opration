package com.java.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.entity.Department;
import com.java.repo.DepartmentRepo;
@Service
public class DepartmentServicesImpl implements DepartmentServices{

	@Autowired
	private DepartmentRepo repo;
	@Override
	public Department saveDepartment(Department department) {

		return repo.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {

		return (List<Department>)repo.findAll();
	}

	@Override
	public Department upadateDepartment(Department department, Long departmentId) {

		Department depDB
		= repo.findById(departmentId)
		.get();

		if (Objects.nonNull(department.getDepartmentName())
				&& !"".equalsIgnoreCase(
						department.getDepartmentName())) {
			depDB.setDepartmentName(
					department.getDepartmentName());
		}

		if (Objects.nonNull(
				department.getDepartmentaddress())
				&& !"".equalsIgnoreCase(
						department.getDepartmentaddress())) {
			depDB.setDepartmentaddress(department.getDepartmentaddress());
		}

		if (Objects.nonNull(department.getDepartmentCode())
				&& !"".equalsIgnoreCase(
						department.getDepartmentCode())) {
			depDB.setDepartmentCode(
					department.getDepartmentCode());
		}

		return repo.save(depDB);
	}

	@Override
	public void delateDepartmentById(Long departmentId) {
		repo.deleteById(departmentId);

	}

}
