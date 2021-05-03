package com;

public class RandomNumberExt {

    public int getRandNumber(int min, int max) {
        return (int)(Math.random()*((max - min) / 2) * 2);
    }

}
