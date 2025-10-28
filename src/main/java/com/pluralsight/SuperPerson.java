package com.pluralsight;

public class SuperPerson {
    String name;
    int age;
    String superPower;
    String zodiacSign;
    int health;

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

    //derived getter isAlive

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

    //public attack
    //attack - health xp to opponent
    //attack power
    //return attack amount

    //attacked
    //loses attack amount of health
}

