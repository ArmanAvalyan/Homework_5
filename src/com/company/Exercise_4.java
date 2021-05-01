package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bound = scanner.nextInt();
        int count = countEven(bound);
        int[] array = initializingArray(createArray(bound));
        System.out.println(Arrays.toString(array));
        System.out.println(count);
        int[] newArr = newArr(array, count);
        System.out.println(Arrays.toString(newArr));

    }

    static int[] createArray(int count) {
        int[] array = new int[count];
        return array;
    }

    static int[] initializingArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    static boolean isEven(int number) {
        boolean isEven = false;
        if (number % 2 == 0)
            isEven = true;
        return isEven;
    }

    static int countEven(int bound) {
        int count = 0;
        for (int i = 1; i < bound; i++) {
            boolean isEven = isEven(i);
            if (isEven) {
                count++;
            }
        }
        return count;
    }

    static int[] newArr(int[] array, int count) {
        int[] newArray = createArray(count);
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                boolean isEven = isEven(i);
                if (isEven) {
                    newArray[j] = array[i];
                    break;
                }
            }
        }
        return newArray;
    }
}