package com.attractor.exam7.dto;

import com.attractor.exam7.model.Client;
import lombok.*;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class ClientDTO {
    public static ClientDTO from(Client client) {

        return builder()
                .id(client.getId())
                .username(client.getUsername())
                .email(client.getEmail())
                .build();


    }

    public String id;
    public String username;
    public String email;

}
