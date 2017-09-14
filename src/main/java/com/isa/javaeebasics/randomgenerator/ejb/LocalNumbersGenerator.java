package com.isa.javaeebasics.randomgenerator.ejb;

import javax.ejb.Local;

@Local
public interface LocalNumbersGenerator {
    int getRandomInt(int upperBound);
}
