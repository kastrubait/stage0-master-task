package com.epam.OOP;

public class Animal {

    String color;
    int numberOfPaws;
    boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public String getDescription() {
        String ans = hasFur ? "a" : "no";
        String valuePaw = (numberOfPaws == 1) ? " paw" : " paws";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + valuePaw + " and " + ans + " fur.";
    }
}