package com.company;

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
        int[] firstArray = initializingArray(createArray(firstLength));
        int[] secondArray = initializingArray(createArray(secondLength));
        printArray(firstArray);
        printArray(secondArray);

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = i; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[i])
                    System.out.println(firstArray[i] + " ");
                break;
            }
        }

    }

    static int[] createArray(int length) {
        int[] array = new int[length];
        return array;
    }

    static int[] initializingArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(3);
        }
        return array;
    }

    static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }


}
