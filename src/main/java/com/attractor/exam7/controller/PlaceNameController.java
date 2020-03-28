package com.attractor.exam7.controller;

import com.attractor.exam7.model.PlaceName;
import com.attractor.exam7.service.PlaceNameService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/place")
public class PlaceNameController {
    private final PlaceNameService placeNameService;

    public PlaceNameController(PlaceNameService placeNameService) {
        this.placeNameService = placeNameService;
    }


    @GetMapping
    public Iterable<PlaceName> getPlaceName() {
        return placeNameService.getPlaceName();
    }
}
