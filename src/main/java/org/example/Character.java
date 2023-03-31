package org.example;

import lombok.Data;

@Data
public abstract class Character {
    private final String name;
    private int healthPoints;
    private final int maxHealth;
    private int damagePoints;

    public Character(String name, int healthPoints, int damagePoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.maxHealth = healthPoints;
        this.damagePoints = damagePoints;
    }

    public void attack(Character character, int damage) {
        character.setHealthPoints(character.getHealthPoints()-damage);
    }

    public int defend(){
        return (int) (this.maxHealth * 0.05);
    }

}
