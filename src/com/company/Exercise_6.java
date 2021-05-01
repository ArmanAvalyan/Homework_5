// Write a Java program to find the common elements between two arrays of integers

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first array length: ");
        int firstLength = scanner.nextInt();
        System.out.print("Enter the second array length: ");
        int secondLength = scanner.nextInt();
        int[] firstArray = initializingArray(firstLength);
        int[] secondArray = initializingArray(secondLength);
        printArray(firstArray);
        printArray(secondArray);
        printArray(commonElements(firstArray, secondArray));
    }

    static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    static int[] initializingArray(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(8);
        }
        return array;
    }

    static boolean compare(int[] array, int number) {
        for (int i : array) {
            if (i == number)
                return false;
        }
        return true;
    }

    static int[] commonElements(int[] firstArray, int[] secondArray) {
        int[] result = new int[15];
        int newIndex = 0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = i; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j] && compare(result, firstArray[i])) {
                    result[newIndex] = firstArray[i];
                    newIndex++;
                    break;
                }
            }
        }
        return result;
    }
}
