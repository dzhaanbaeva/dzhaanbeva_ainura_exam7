package com.attractor.exam7.service;

import com.attractor.exam7.dto.OrderDTO;
import com.attractor.exam7.model.Client;
import com.attractor.exam7.model.DishName;
import com.attractor.exam7.model.Order;
import com.attractor.exam7.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public OrderDTO addOrder(OrderDTO orderData) {

        Order order = Order.builder()
                .client(Client.builder().id(orderData.getClientId()).build())
                .dishName(DishName.builder().id(orderData.getDishId()).build())
                .dateTime(LocalDateTime.now())
                .build();

        orderRepository.save(order);
        return OrderDTO.from(order);
    }

    public Iterable<Order> getOrder() {
        return orderRepository.findAll();
    }
}




