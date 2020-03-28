package com.attractor.exam7.dto;

import com.attractor.exam7.model.Client;
import com.attractor.exam7.model.DishName;
import com.attractor.exam7.model.PlaceName;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class DishNameDTO {
    public static DishNameDTO from(DishName dishName) {

        return builder()
                .id(dishName.getId())
                .name(dishName.getName())
                .typeOfDish(dishName.getTypeOfDish())
                .price(dishName.getPrice())
                .placeNameId(dishName.getPlaceName().getId())
                .build();


    }

    public String id;
    public String name;
    public String typeOfDish;
    public double price;
    public String placeNameId;


}


