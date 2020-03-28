package com.attractor.exam7.dto;
import com.attractor.exam7.model.PlaceName;
import lombok.*;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class PlaceNameDTO {
    public static PlaceNameDTO from(PlaceName placeName) {

        return builder()
                .id(placeName.getId())
                .name(placeName.getName())
                .description(placeName.getDescription())
                .build();


    }

    public String id;
    public String name;
    public String description;

}
