package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int numberLength = String.valueOf(number).length();
        int positiveNumber = number < 0 ? number * (-1) : number ;
        int divider = 1;
        int result = 0;
        for (int i = 1; i < numberLength; i++) {
            divider *= 10;
        }
        for (int i = numberLength; i > 0 ; i--) {
            result += positiveNumber / divider;
            positiveNumber = positiveNumber % divider;
            divider /= 10;
        }
        System.out.println(result);
    }
}
