package org.example;

import lombok.Data;

@Data
public class Potion {
    private final String name;
    private final int value;

    public Potion(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
