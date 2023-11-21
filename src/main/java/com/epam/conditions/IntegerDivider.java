package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        int res;
        if (divider != 0) {
            res = dividend / divider;
            System.out.println(res * divider == dividend
                    ? "can be divided completely"
                    : "cannot be divided completely");
        } else {
            System.out.println("division by zero");
        }
    }

}
