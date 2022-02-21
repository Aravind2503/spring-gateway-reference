package com.example.conservice;

// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/customers")
@RestController
public class ConController {
    private List<Cons> customers = Arrays.asList(
            new Cons(1, "Joe Bloggs"),
            new Cons(2, "Jane Doe"));

    @GetMapping
    public List<Cons> getAllCustomers() {
        return customers;
    }

    @GetMapping("/{id}")
    public Cons getCustomerById(@PathVariable int id) {
        return customers.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
