package com.lukish.vehiclehiringsystem.repositories;

import com.lukish.vehiclehiringsystem.models.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
