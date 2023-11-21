package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if (x != 0 && y != 0) {
            if (x > 0) {
                if (x * y > 0) {
                    System.out.println("first");
                } else System.out.println("fourth");
            } else {
                if (x * y > 0) {
                    System.out.println("third");
                } else {
                    System.out.println("second");
                }
            } }
        if (x == 0 || y == 0) System.out.println("zero");
    }

}

