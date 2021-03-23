package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeIdentity;

public interface EmployeeRepository extends JpaRepository<Employee, EmployeeIdentity> {

	List<Employee> findByIdentity(String companyId);

}
