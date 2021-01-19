package com.lukish.vehiclehiringsystem.repositories;

import java.util.Optional;

import com.lukish.vehiclehiringsystem.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public Employee findByUsername(String un);
}
