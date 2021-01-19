package com.lukish.vehiclehiringsystem.repositories;

import com.lukish.vehiclehiringsystem.models.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {

}
