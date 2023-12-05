package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        System.out.println(number/100 + number % 100 / 10 * 10 + number % 10 * 100);
    }

}
