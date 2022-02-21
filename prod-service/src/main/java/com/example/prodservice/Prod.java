package com.example.prodservice;

public class Prod {
    private final int id;
    private final int customerId;
    private final String name;

    public Prod(final int id, final int customerId, final String name) {
        this.id = id;
        this.customerId = customerId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}
