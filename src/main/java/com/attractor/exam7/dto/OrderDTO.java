package com.attractor.exam7.dto;


import com.attractor.exam7.model.Order;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class OrderDTO {
    public static OrderDTO from(Order order) {

        return builder()
                .id(order.getId())
                .clientId(order.getClient().getId())
                .dishId(order.getDishName().getId())
                .placeId(order.getPlaceName().getId())
                .dateTime(LocalDateTime.now())
                .build();


    }

    public String id;
    public String clientId;
    public String dishId;
    public String placeId;

    public LocalDateTime dateTime = LocalDateTime.now();

}
