package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise_6 {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the first array length: ");
//        int firstLength = scanner.nextInt();
//        System.out.print("Enter the second array length: ");
//        int secondLength = scanner.nextInt();
//        int[] firstArray = initializingArray(createArray(firstLength));
//        int[] secondArray = initializingArray(createArray(secondLength));
//        printArray(firstArray);
//        printArray(secondArray);
//
//        for (int i = 0; i < firstArray.length; i++) {
//            int temp = firstArray[i];
//            for (int j = i; j < secondArray.length; j++) {
//                if (temp == secondArray[i])
//                    System.out.print(temp + " ");
//                break;
//            }
//        }

        int[] array_1 = new int[]{1, 2, 5, 3, 6, 8, 7, 9, 6, 5, 4, 7};
        int[] array_2 = new int[]{2, 3, 7, 5, 9, 11, 15, 78, 47, 63, 29};
               commonElements(array_1, array_2);
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

    public static void commonElements(int[] array_1, int[] array_2) {
        int lenght = 0;
        if (array_1.length < array_2.length) {
            lenght = array_1.length;
        }
        if (array_2.length < array_1.length) {
            lenght = array_2.length;
        }

        int[] result = new int[lenght];
        int indexOvResult = 0;
        for (int i = 0; i < array_1.length; i++) {
            int element = array_1[i];
            for (int j = 0; j < array_2.length; j++) {
                if (element == array_2[j]) {
                    for (int k = 0; k < result.length; k++) {
                        if (element == result[k]) {
                            break;
                        }
                        result[indexOvResult] = element;
                        indexOvResult++;
                    }
                   break;
                }

            }
        }
        System.out.println(Arrays.toString(result));
    }

}
