// Write a Java method to compute the sum of the digits in an integer.

package com.company;

import java.util.Scanner;

public class Exercise_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();
        int sumDigits = getDigitsSum(number);
        System.out.println("The sum is: " + sumDigits);
    }

    static int getDigitsSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
