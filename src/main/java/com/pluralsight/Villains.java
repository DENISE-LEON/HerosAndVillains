package com.pluralsight;

public class Villains extends SuperPerson {
    String villainName;
    int emotionalDamage;

    public String getVillainName() {
        return villainName;
    }

    public int getEmotionalDamage() {
        return emotionalDamage;
    }

    public void setVillainName(String villainName) {
        this.villainName = villainName;
    }

    public void setEmotionalDamage(int emotionalDamage) {
        this.emotionalDamage = emotionalDamage;
    }

    public Villains(String name, int age, String superPower, String zodiacSign, int health, String villainName, int emotionalDamage) {
        super(name, age, superPower, zodiacSign, health);
        this.villainName = villainName;
        this.emotionalDamage = emotionalDamage;
    }
}
