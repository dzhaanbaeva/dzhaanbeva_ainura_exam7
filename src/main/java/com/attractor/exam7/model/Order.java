package com.attractor.exam7.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Document(collection = "orders")
@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Order {
    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    @DBRef
    public  Client client;
    @DBRef
    public  DishName dishName;
    @DBRef
    public  PlaceName placeName;
    public LocalDateTime dateTime;

    public Order(String id, Client client, DishName dishName,PlaceName placeName) {
        this.id = id;
        this.client = client;
        this.dishName = dishName;
        this.placeName = placeName;
        this.dateTime = LocalDateTime.now();

    }
}
