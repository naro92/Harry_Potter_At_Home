package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Wizard extends Character{
    private final Pet pet;
    private final Wand wand;
    private final House house;
    private List<Spell> knownSpells;
    private List<Potion> potions;

    public Wizard(String name, int hp, int damagePoints, Pet pet, Wand wand, House house) {
        super(name, hp, damagePoints);
        this.pet = pet;
        this.wand = wand;
        this.house = house;
    }


    public void addSpell(Spell spell) {
        this.knownSpells.add(spell);
    }

    public void addPotions(Potion potion) {
        this.potions.add(potion);
    }

}
