package dev.kei;

import java.security.SecureRandom;

public class App
{
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public static void main( String[] args )
    {
        System.out.println("Generating random number...");
        System.out.println("Random number: " + getRandomNumber(0, 100));
    }

    private static Integer getRandomNumber(Integer min, Integer max) {
        return SECURE_RANDOM.nextInt(max - min) + min;
    }
}
