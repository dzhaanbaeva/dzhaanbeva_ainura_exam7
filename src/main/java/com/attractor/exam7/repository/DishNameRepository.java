package com.attractor.exam7.repository;

import com.attractor.exam7.model.DishName;
import com.attractor.exam7.model.PlaceName;
import org.springframework.data.repository.CrudRepository;

public interface DishNameRepository extends CrudRepository<DishName, String> {
    public Iterable<DishName> findAll();
    public Iterable<DishName> findDishNameByPlaceNameId(String id);
}
