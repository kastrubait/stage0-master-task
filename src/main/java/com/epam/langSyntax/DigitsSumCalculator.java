package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        int numberChange = number;

        int digit = numberChange % 10;
        sum += digit;
        numberChange /= 10;

        digit = numberChange % 10;
        sum += digit;
        numberChange /= 10;

        digit = numberChange % 10;
        sum += digit;
        numberChange /= 10;

        sum += numberChange;

        System.out.println(sum);
    }

}
