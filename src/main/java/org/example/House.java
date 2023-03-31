package org.example;

import lombok.Data;

@Data
public class House {

    private final String name;
    private final String description;

    private String characteristic;

    public House(String name, String description) {
        this.name = name;
        this.description = description;

        switch (name) {
            case "Gryffindor" :
                this.characteristic = "Resistant Wizards";
                break;
            case "HufflePuff":
                this.characteristic = "Potion Masters";
                break;
            case "Slytherin" :
                this.characteristic = "Strong Spells";
                break;
            case "Ravenclaw" :
                this.characteristic = "Wizard Scouts";
                break;
        }
    }

}
