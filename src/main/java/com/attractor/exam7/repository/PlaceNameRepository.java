package com.attractor.exam7.repository;

import com.attractor.exam7.model.PlaceName;
import org.springframework.data.repository.CrudRepository;

public interface PlaceNameRepository extends CrudRepository<PlaceName, String> {
    public Iterable<PlaceName> findAll();
}
