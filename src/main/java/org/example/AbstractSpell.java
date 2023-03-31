package org.example;


import lombok.Data;

@Data
public abstract class AbstractSpell {
    private final String name;
    private final int damageMultiplier;
    private final String description;
    private final int successRate;

    protected AbstractSpell(String name, int damageMultiplier, String description, int successRate) {
        this.name = name;
        this.damageMultiplier = damageMultiplier;
        this.description = description;
        this.successRate = successRate;
    }

    public void castSpell(Wizard wizard, Enemy enemy) {
        System.out.println(wizard.getName() + " uses " + this.name + " on " + enemy.getName());

        if (Math.random() * 100 <= this.successRate){
            enemy.setHealthPoints(enemy.getHealthPoints() - wizard.getDamagePoints() * this.damageMultiplier);
            System.out.println("Nice Cast ! Your enemy took : " + wizard.getDamagePoints() * this.damageMultiplier);
        }else{
            System.out.println("You missed your spell ! Too bad, your enemy still has " + enemy.getHealthPoints() + " HP.");
        }
    }
}
