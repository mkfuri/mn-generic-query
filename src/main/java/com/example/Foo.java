package com.example;

import io.micronaut.data.annotation.MappedEntity;

@MappedEntity
public class Foo extends GenericClass<Long> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
