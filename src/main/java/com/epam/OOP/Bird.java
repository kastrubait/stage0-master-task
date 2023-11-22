package com.epam.OOP;

public class Bird extends Animal {
    public Bird(){
        super("blue", 2,  false);
    }

    public String getDescription() {
        String ans = hasFur ? "a" : "no";
        String valuePaw = (numberOfPaws == 1) ? " paw" : " paws";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + valuePaw + " and " + ans + " fur. Moreover, it has 2 wings and can fly.";
    }

}

