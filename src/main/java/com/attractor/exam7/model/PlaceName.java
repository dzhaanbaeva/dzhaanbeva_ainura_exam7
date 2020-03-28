package com.attractor.exam7.model;

//import com.attractor.exam7.util.GenerateData;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Document(collection = "placeNames")
@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
public class PlaceName {
    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    public  String name;
    public  String description;


    }
