package com.pluralsight;

import java.util.ArrayList;

public class PlayerRoster {
    ArrayList<SuperHero> superHeros = new ArrayList<>();
    ArrayList<Villains> superVillains = new ArrayList<>();
    ArrayList<String> shrekPhrases = new ArrayList<>();
    ArrayList<String> karenPhrases = new ArrayList<>();
    ArrayList<String> doraPhrases = new ArrayList<>();


    private PlayerRoster() {
        //list of available hero's
        superHeros.add(new SuperHero("Shrek", 444, " it's Never Ogre", "Taurus", 1000,
                "The Shrekinator", 55));

        superHeros.add(new SuperHero("Poot Lovato", 34, "Basement Domain", "Leo", 800,
                "Winnie the Poot", 0));

        superHeros.add(new SuperHero("Bruce Barthalemew Wayne Leon", 1, "Stealing toast", "Leo", 1212, "Batman", 79));



        //list of available villains
        superVillains.add(new Villains("Karen", 55, "Let me speak to your manager", "No one knows", 500, "Karen", 99));
        superVillains.add(new Villains("Dora", 25, "Bullying & Sassiness", "Leo", 450, "Dorita", 77));
        superVillains.add(new Villains("Susan from 3rd grade", 12, "Stealing your new 64 pack colored pencils", "Gemeni", 100, "Susan",666));


        //list of catchprases
        //shrek
        shrekPhrases.add("Prepare for the Shrekoning");
        shrekPhrases.add("Get Shrecked");

        //karen
        karenPhrases.add("yOu nEeD tO LEavE");
        karenPhrases.add("i'm calling the cops");

        //dora phrases
        doraPhrases.add("Don't worry about what i'm into");
        doraPhrases.add("Meow");

        //random phrases


    }

    //method to display the rosters

}
