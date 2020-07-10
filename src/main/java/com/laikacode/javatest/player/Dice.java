package com.laikacode.javatest.player;

import java.util.Random;

public class Dice {

    private static final int MAX = 6;

    public int roll(){
        return new Random().nextInt(MAX) + 1;
    }
}
