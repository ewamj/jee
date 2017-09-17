package com.isa.javaeebasics.randomgenerator.ejb;

import javax.ejb.Remote;

@Remote
public interface RemoteNumbersGenerator {
    int getRandomInt(int upperBound);
}
