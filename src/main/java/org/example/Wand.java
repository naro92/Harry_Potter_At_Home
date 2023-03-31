package org.example;

import lombok.Data;

@Data
public class Wand {
    private final Core core;
    private final int size;

    public Wand(Core core, int size) {
        this.core = core;
        this.size = size;
    }
}
