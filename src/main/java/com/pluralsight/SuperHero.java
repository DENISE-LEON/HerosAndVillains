package com.pluralsight;

public class SuperHero extends SuperPerson {
    String heroName;
    int therapySessions;

    public String getHeroName() {
        return heroName;
    }

    public int getTherapySessions() {
        return therapySessions;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setTherapySessions(int therapySessions) {
        this.therapySessions = therapySessions;
    }

    public SuperHero(String name, int age, String superPower, String zodiacSign, int health, String heroName, int therapySessions) {
        super(name, age, superPower, zodiacSign, health);
        this.heroName = heroName;
        this.therapySessions = therapySessions;
    }
}
