package com.attractor.exam7.service;

import com.attractor.exam7.model.DishName;
import com.attractor.exam7.repository.DishNameRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class DishNameService {

        private final DishNameRepository dishNameRepository;

    public DishNameService(DishNameRepository dishNameRepository) {
        this.dishNameRepository = dishNameRepository;
    }

    public Iterable<DishName> selectDishNameByPlaceNameId(String id) {
        return dishNameRepository.findDishNameByPlaceNameId(id);
    }

        public Iterable<DishName> getDishName() {
            return dishNameRepository.findAll();
        }
    }

