package com.isa.javaeebasics.randomgenerator;

import com.isa.javaeebasics.randomgenerator.ejb.LocalNumbersGenerator;
import com.isa.javaeebasics.randomgenerator.ejb.RemoteNumbersGenerator;
import com.isa.javaeebasics.randomgenerator.interceptors.TimeLoggingInterceptor;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import java.util.Random;

@Stateless
public class NumbersGenerator implements LocalNumbersGenerator, RemoteNumbersGenerator {

    Random random = new Random();

    @Interceptors(TimeLoggingInterceptor.class)
    @Override
    public int getRandomInt(int upperBound) {
        return random.nextInt(upperBound);
    }
}
