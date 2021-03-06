// Write a Java method to check whether a year (integer) entered by the user is a leap year or not

package com.company;

import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = scanner.nextInt();
        System.out.println(isLapYear(year));

    }

    static boolean isLapYear(int year) {
        boolean a, b, c;
        a = (year % 4 == 0);
        b = (year % 100 != 0);
        c = ((year % 400 == 0) && (year % 100 == 0));
        return a && (b || c);
    }
}
