package org.example;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {// a method for calculating the a numbers ones, tens, hundrets and thousends digit
        Scanner scanner = new Scanner(System.in);
        System.out.println("State the number");
        int number = scanner.nextInt();


        for (int i = 0; i < 4; i++) {
            System.out.println(number % 10);
            number = number / 10;
        }


    }
}
