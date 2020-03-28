package com.attractor.exam7.util;

import com.attractor.exam7.model.Client;
import com.attractor.exam7.model.DishName;
import com.attractor.exam7.model.Order;
import com.attractor.exam7.model.PlaceName;
import com.attractor.exam7.repository.ClientRepository;
import com.attractor.exam7.repository.DishNameRepository;
import com.attractor.exam7.repository.OrderRepository;
import com.attractor.exam7.repository.PlaceNameRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import java.util.ArrayList;
import java.util.List;


@Configuration
public class PreloadDataBase {

    @Bean
    CommandLineRunner usersInit(ClientRepository clientRepo, DishNameRepository dishNameRepo, OrderRepository orderRepo, PlaceNameRepository placeNameRepo) {
        return (args) -> {
            clientRepo.deleteAll();
            dishNameRepo.deleteAll();
            orderRepo.deleteAll();
            placeNameRepo.deleteAll();

            List<Client> clients = new ArrayList<>();
            clients.add(new Client("1", "ainura", "ainura@gmail.com",  new BCryptPasswordEncoder().encode("123")));
            clients.add(new Client("2", "user", "user@gmail.com",  new BCryptPasswordEncoder().encode("452")));
            clients.add(new Client("3", "aika", "aika@gmail.com",  new BCryptPasswordEncoder().encode("567")));
            clients.add(new Client("4", "aibek", "aibek@gmail.com",  new BCryptPasswordEncoder().encode("aibek452")));
            clientRepo.saveAll(clients);

            List<PlaceName> placeName = new ArrayList<>();
            placeName.add(new PlaceName("1", "ProKazan", "restaurant"));
            placeName.add(new PlaceName("2", "Center Plova", "restaurant"));
            placeName.add(new PlaceName("3", "Buffet", "cafe"));
            placeName.add(new PlaceName("4", "Cafe De Paris", "cafe"));
            placeNameRepo.saveAll(placeName);

            List<DishName> dishNames = new ArrayList<>();
            dishNames.add(new DishName("1", "Margherita", "Pizza", 250, placeName.get(0)));
            dishNames.add(new DishName("2", "Pumpkin pie", "Dessert", 150, placeName.get(3)));
            dishNames.add(new DishName("3", "Vat grown steak", "Belter food", 450, placeName.get(1)));
            dishNames.add(new DishName("4", "Herbal tea", "Hot Beverage", 200, placeName.get(2)));
            dishNameRepo.saveAll(dishNames);


            List<Order> orders = new ArrayList<>();
            orders.add(new Order("1", clients.get(0), dishNames.get(0), placeName.get(0)));
            orders.add(new Order("2", clients.get(1), dishNames.get(1), placeName.get(3)));
            orders.add(new Order("3", clients.get(2), dishNames.get(2), placeName.get(1)));
            orders.add(new Order("4", clients.get(3), dishNames.get(3), placeName.get(2)));
            orderRepo.saveAll(orders);
        };

    }

}




