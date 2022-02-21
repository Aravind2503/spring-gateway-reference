package com.example.conservice;

public class Cons {
    private final int id;
    private final String name;

    public Cons(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
