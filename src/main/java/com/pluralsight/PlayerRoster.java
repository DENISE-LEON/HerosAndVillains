package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class PlayerRoster {
    ArrayList<SuperHero> superHeros = new ArrayList<>();
    ArrayList<Villains> superVillains = new ArrayList<>();
    ArrayList<String> shrekPhrases = new ArrayList<>();
    ArrayList<String> karenPhrases = new ArrayList<>();
    ArrayList<String> doraPhrases = new ArrayList<>();
    ArrayList<String> randomPhrases = new ArrayList<>();




    private PlayerRoster() {

         //list of catchprases
        //shrek
        shrekPhrases.add("Prepare for the Shrekoning");
        shrekPhrases.add("Get Shrecked");
        shrekPhrases.add("It's ogre for you");

        //karen
        karenPhrases.add("yOu nEeD tO LEavE");
        karenPhrases.add("i'm calling the cops");
        karenPhrases.add("do you know who I am?");

        //dora phrases
        doraPhrases.add("Don't worry about what i'm into");
        doraPhrases.add("I'm hungry");
        doraPhrases.add("Drink milk");

        //random phrases
        randomPhrases.add("Bing Bong");
        randomPhrases.add("Pow Bang");
        randomPhrases.add("You've yee'd your last haw")


        //adding catchphrases to the arraylist of catch phrases


        //list of available hero's

        superHeros.add(new SuperHero("Shrek", 444, " it's Never Ogre", "Taurus", 1000,
                "The Shrekinator", 55, shrekPhrases));

        superHeros.add(new SuperHero("Poot Lovato", 34, "Basement Domain", "Leo", 800,
                "Winnie the Poot", 0));

        superHeros.add(new SuperHero("Bruce Barthalemew Wayne Leon", 1, "Stealing toast", "Leo",
                1212, "Batman", 79));



        //list of available villains

        superVillains.add(new Villains("Karen", 55, "Let me speak to your manager", "No one knows",
                500, "Karen", 99, karenPhrases));

        superVillains.add(new Villains("Dora", 25, "Bullying & Sassiness", "Leo",
                450, "Dorita", 77, doraPhrases));

        superVillains.add(new Villains("Susan from 3rd grade", 12, "Stealing your new 64 pack colored pencils", "Gemeni",
                100, "Susan",666));






    }

    //method to display the rosters


}
