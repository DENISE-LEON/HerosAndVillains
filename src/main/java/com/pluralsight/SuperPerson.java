package com.pluralsight;

import java.util.ArrayList;
import java.util.Random;

public abstract class SuperPerson {
    String name;
    int age;
    String superPower;
    String zodiacSign;
    int health;
    ArrayList<String> catchPhrases;

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSuperPower() {
        return superPower;
    }

    public String getZodiacSign() {
        return zodiacSign;
    }

    public ArrayList<String> getCatchPhrases() {
        return catchPhrases;
    }

    //derived getter isAlive
    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public void setZodiacSign(String zodiacSign) {
        this.zodiacSign = zodiacSign;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public SuperPerson(String name, int age, String superPower, String zodiacSign, int health) {
        this.name = name;
        this.age = age;
        this.superPower = superPower;
        this.zodiacSign = zodiacSign;
        this.health = health;
    }

    public SuperPerson(String name, int age, String superPower, String zodiacSign, int health, ArrayList catchPhrases) {
        this.name = name;
        this.age = age;
        this.superPower = superPower;
        this.zodiacSign = zodiacSign;
        this.health = health;
        this.catchPhrases = catchPhrases;

    }

    public int fight(SuperPerson opponent) {
        Random rand = new Random();
        int attackDamage = rand.nextInt(101);
        return attackDamage;
    }
    //attack - health xp to opponent
    //attack power
    //return attack amount

    //attacked
    //loses attack amount of health
    public void ouch(int attackDamage) {
        this.health -= attackDamage;
    }

}

