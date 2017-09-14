package com.isa.javaeebasics.randomgenerator;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        NumbersGenerator numbersGenerator = new NumbersGenerator();
        int randomInt = numbersGenerator.getRandomInt(100);
        System.out.println(randomInt);
    }
}
