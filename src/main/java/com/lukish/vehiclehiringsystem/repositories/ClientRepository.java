package com.lukish.vehiclehiringsystem.repositories;

import com.lukish.vehiclehiringsystem.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
