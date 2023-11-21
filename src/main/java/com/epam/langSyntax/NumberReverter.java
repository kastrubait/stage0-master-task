package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int last = number % 10;
        int prev = number / 10;
        int medium = prev % 10;
        int first = prev / 10;
        System.out.println(last + "" + medium + "" + first);
    }

}
