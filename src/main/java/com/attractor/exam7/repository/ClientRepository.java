package com.attractor.exam7.repository;

import com.attractor.exam7.model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClientRepository extends CrudRepository<Client, String> {
    public Optional<Client> findByUsername(String name);
}
