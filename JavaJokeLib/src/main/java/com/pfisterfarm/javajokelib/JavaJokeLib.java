package com.pfisterfarm.javajokelib;

import java.util.Random;

public class JavaJokeLib {
    public static String tellMeAJoke() {
        Random rand = new Random();
        switch (rand.nextInt(5)) {
            case 0: return "An Android app walks into a bar. Bartender asks, \"Can I get you a drink?\" The app looks disappointed and says, \"That wasn't my intent.\"";
            case 1: return "Q: how many programmers does it take to change a light bulb?  " +
                    "A: none, thatâ€™s a hardware problem";
            case 2: return "A SQL query goes into a bar, walks up to two tables and asks, 'Can I join you'";
            case 3: return "To understand what recursion is, you must first understand recursion.";
            case 4: return "Q: Why do Java programmers have to wear glasses?  A: Because they don't C#";
        }
        return "tellMeAJoke() has reached somewhere it shouldn't have";
    }
}
