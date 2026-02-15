package org.example;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {//a method for calculating wheter a yae is a leap year or not
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give your year");
        int year = scanner.nextInt();

        System.out.println(leapYear(year));

    }

    public static String leapYear(int year) {
        String isLeap = "";
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeap = "This Year is not a Leap Year";
            } else if (year % 400 == 0){
                isLeap = "This year is a leap year";
        } else {
            isLeap = "This year is a leap year";}

        }else {
            isLeap = "This Year is not a Leap Year";

        }
        return isLeap;
    }
}
