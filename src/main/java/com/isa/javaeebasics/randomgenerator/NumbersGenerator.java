package com.isa.javaeebasics.randomgenerator;

import java.util.Random;

public class NumbersGenerator {

    Random random = new Random();

    public int getRandomInt(int upperBound) {
        return random.nextInt(upperBound);
    }
}
