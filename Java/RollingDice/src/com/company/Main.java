package com.company;

public class Main {

    public static void main(String[] args) {
        int roll1 = rollDice();
        int roll2 = rollDice();
        System.out.println("Roll 1: " + roll1);
        System.out.println("Roll 2: " + roll2);
    }
    public static int rollDice() {
        double randomNumber = Math.random();
        randomNumber = randomNumber * 6;
        randomNumber = randomNumber + 1;
        int randomInt = (int) randomNumber;
        return randomInt;
    }
}
