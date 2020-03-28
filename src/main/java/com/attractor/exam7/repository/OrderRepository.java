package com.attractor.exam7.repository;


import com.attractor.exam7.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, String> {
    public Iterable<Order> findAll();
}
