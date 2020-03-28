package com.attractor.exam7.model;

//import com.attractor.exam7.util.GenerateData;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Document(collection = "dishes")
@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class DishName {
    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    public String name;
    public String typeOfDish;
    public double price;
    @DBRef
    public  PlaceName placeName;


    public DishName(String id, String name, String typeOfDish, double price, PlaceName placeName) {
        this.id = id;
        this.name = name;
        this.typeOfDish = typeOfDish;
        this.price = price;
        this.placeName = placeName;
    }


}
