package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int febDaysCount = 28;
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            febDaysCount = 29;
        }
        switch (month){
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                System.out.println(31);
                break;
            case (4):
            case (6):
            case (9):
            case (11):
                System.out.println(30);
                break;
            case (2):
                System.out.println(febDaysCount);
                break;
            default:
                System.out.println("invalid date");
                break;

        }
    }

}
