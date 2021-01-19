package com.lukish.vehiclehiringsystem.repositories;

import com.lukish.vehiclehiringsystem.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
