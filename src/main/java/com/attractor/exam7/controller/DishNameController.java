package com.attractor.exam7.controller;

import com.attractor.exam7.model.DishName;
import com.attractor.exam7.model.PlaceName;
import com.attractor.exam7.service.DishNameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dish")
public class DishNameController {
    private final DishNameService dishNameService;

    public DishNameController(DishNameService dishNameService) {
        this.dishNameService = dishNameService;
    }
    @GetMapping
    public Iterable<DishName> getPlaceName() {
        return dishNameService.getDishName();
    }
    @GetMapping("/place/{id}")
    public Iterable<DishName> selectPublications(@PathVariable("id") String id){
        return dishNameService.selectDishNameByPlaceNameId(id);
    }

}
