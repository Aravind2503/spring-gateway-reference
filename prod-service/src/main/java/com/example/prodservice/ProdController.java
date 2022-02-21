package com.example.prodservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/orders")
@RestController
public class ProdController {
    private final List<Prod> orders = Arrays.asList(
            new Prod(1, 1, "Product A"),
            new Prod(2, 1, "Product B"),
            new Prod(3, 2, "Product C"),
            new Prod(4, 1, "Product D"),
            new Prod(5, 2, "Product E"));

    @GetMapping
    public List<Prod> getAllOrders() {
        return orders;
    }

    @GetMapping("/{id}")
    public Prod getOrderById(@PathVariable int id) {
        return orders.stream()
                .filter(order -> order.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

}
