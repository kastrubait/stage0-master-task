package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 2:
                boolean condLeap;
                if (year % 100 == 0 ) {
                    condLeap = year % 400 == 0;
                } else {
                    condLeap = year % 4 == 0;
                }
                System.out.println(condLeap ? "29" : "28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("invalid date");
                break;
        }
    }

}
