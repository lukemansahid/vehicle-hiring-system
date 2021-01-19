package com.lukish.vehiclehiringsystem.repositories;

import com.lukish.vehiclehiringsystem.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
