package com.isa.javaeebasics.randomgenerator;

import com.isa.javaeebasics.randomgenerator.ejb.LocalNumbersGenerator;
import com.isa.javaeebasics.randomgenerator.ejb.RemoteNumbersGenerator;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import java.util.Random;

@Stateless
public class NumbersGenerator implements LocalNumbersGenerator, RemoteNumbersGenerator {

    Random random = new Random();

    @Override
    public int getRandomInt(int upperBound) {
        return random.nextInt(upperBound);
    }
}
