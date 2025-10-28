package com.pluralsight;

import java.util.ArrayList;
import java.util.Random;

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

    @Override
    public int fight(SuperPerson opponent ) {
        Random rand = new Random();
        //possibility of dealing extra damage
        int attackDamage = rand.nextInt(101) + rand.nextInt(therapySessions);
        return attackDamage;
    }


}
