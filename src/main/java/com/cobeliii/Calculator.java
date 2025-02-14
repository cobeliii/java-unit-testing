package com.cobeliii;

public class Calculator {
    public int add(int ... numbers) {

        int sum = 0;
        for (int number : numbers) {
            if (number < 0) {
                throw new ArithmeticException();
            }
            sum += number;
        }

        return sum;
    }
}
