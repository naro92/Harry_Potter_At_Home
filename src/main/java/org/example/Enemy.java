package org.example;

import java.util.List;

public class Enemy extends AbstractEnemy {
    public Enemy(String name, int healthPoints, int damagePoints) {
        super(name, healthPoints, damagePoints);
    }

    public void attackWizard(Wizard wizard) {
        if (wizard.getHouse().getCharacteristic().equals("Resistant Wizards")) {
            this.attack(wizard, (int) (this.getDamagePoints() * 0.8));
        }
        this.attack(wizard, this.getDamagePoints());
    }

}

