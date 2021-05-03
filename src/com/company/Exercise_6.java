// Write a Java program to find the common elements between two arrays of integers

package com.company;

import java.util.Arrays;
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
        printArray(getCommonElements(firstArray, secondArray));
    }

    static void printArray(int[] array) {

        System.out.println(Arrays.toString(array));
    }

    static int[] initializingArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 6 + 1);
            array[i] = random;
        }
        return array;
    }

    static boolean compareTheSameValues(int[] array, int number) {
        for (int i : array) {
            if (i == number)
                return false;
        }
        return true;
    }

    static int[] getCommonElements(int[] firstArray, int[] secondArray) {
        int length = Math.min(firstArray.length, secondArray.length);
        int[] array = new int[length];
        int indexOfResult = 0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j] && compareTheSameValues(array, firstArray[i])) {
                    array[indexOfResult] = firstArray[i];
                    indexOfResult++;
                    break;
                }
            }
        }
        int newLength = indexOfResult;
        int[] resultArray = Arrays.copyOf(array, newLength);

        return resultArray;
    }
}
