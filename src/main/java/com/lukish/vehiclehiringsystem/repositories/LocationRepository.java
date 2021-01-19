package com.lukish.vehiclehiringsystem.repositories;

import com.lukish.vehiclehiringsystem.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
