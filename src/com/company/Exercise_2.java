/* Write a method named isEven that accepts an int argument.
The method should return true if the argument is even, or false otherwise.
Also write a program to test your method */

package com.company;

import java.util.Scanner;

public class Exercise_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    static boolean isEven(int number) {
        boolean evenNumber = true;
        if (number % 2 != 0) {
            evenNumber = false;
        }
        return evenNumber;
    }
}
