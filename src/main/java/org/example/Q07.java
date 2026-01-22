package org.example;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("your choice of number: ");
        int number = input.nextInt();

        int result = 0;

        for (int i = 1; i < 11; i++) {
            result = number * i;
            System.out.println(i + " * " + number + " = " + result);
            result = 0;
        }

    }
}
