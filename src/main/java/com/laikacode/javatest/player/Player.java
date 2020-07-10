package com.laikacode.javatest.player;

public class Player {

    private int number;
    private Dice dice;

    public Player(int number, Dice dice) {
        this.number = number;
        this.dice = dice;
    }

    public boolean play(){
        return dice.roll() == number;
    }
}
