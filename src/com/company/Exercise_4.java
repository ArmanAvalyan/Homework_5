// Create a function that finds all even numbers from 1 to the given number

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range of the array: 1 - ");
        int bound = scanner.nextInt();
        int count = countEven(bound);
        System.out.println("The number of even numbers: " + count);
        System.out.println(Arrays.toString(arrayWithEvenNumbers(bound)));

    }

    static boolean isEven(int number) {
        boolean isEven = false;
        if (number % 2 == 0)
            isEven = true;
        return isEven;
    }

    static int countEven(int bound) {
        int count = 0;
        for (int i = 1; i <= bound; i++) {
            if (isEven(i)) {
                count++;
            }
        }
        return count;
    }

    public static int[] arrayWithEvenNumbers(int number) {
        int length = countEven(number);
        int[] array = new int[length];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (isEven(i)) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }
}