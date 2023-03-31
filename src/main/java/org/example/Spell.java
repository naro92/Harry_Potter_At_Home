package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Spell extends AbstractSpell{

    public Spell(String name, int damageMultiplier, String description, int successRate) {
        super(name,damageMultiplier,description,successRate);
    }
}
