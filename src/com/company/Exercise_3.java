/* Given an array of ints, return the number of times that two 6's are next to
each other in the array. Also count instances where the second "6" is actually a 7 */

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length array: ");
        int bound = scanner.nextInt();
        int[] array = initializingArray(createArray(bound), scanner);
        int count = getCount(array);
        System.out.println("array667(" + Arrays.toString(array) + ") → " + count);
    }

    static int[] createArray(int lengthArray) {
        int[] array = new int[lengthArray];
        return array;
    }

    static int[] initializingArray(int[] array, Scanner scanner) {
        System.out.println("Enter the array values: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static int getCount(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 6 && array[i + 1] == 6) {
                count++;
            } else if (array[i] == 6 && array[i + 1] == 7) {
                count++;
            }
        }
        return count;
    }
}
