package com.torres.toni.jokelibrary;

import java.util.Random;

public class JokeProvider {

    private final static String[] jokes = {
            "An Android app walks into a bar. Bartender asks, - Can I get you a drink? - The app " +
                    "looks disappointed and says, - That wasn't my intent.",
            "Knock, Knock. - Who's there? - very long pause... - Java.",
            "I saw a driver texting and driving. It made me so mad I threw my beer at him."
    };

    public static String[] getJokes() {
        return jokes;
    }

    public static String getRandomJoke() {
        return jokes[new Random().nextInt(jokes.length)];
    }

}
