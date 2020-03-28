package com.attractor.exam7.controller;

import com.attractor.exam7.dto.OrderDTO;
import com.attractor.exam7.model.DishName;
import com.attractor.exam7.model.Order;
import com.attractor.exam7.service.OrderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {


        private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public OrderDTO addOrder(@RequestBody OrderDTO orderData) {
        return orderService.addOrder(orderData);
    }
    @GetMapping
    public Iterable<Order> getOrder() {
        return orderService.getOrder();
    }



}
