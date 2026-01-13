package org.example;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        // code for making multiplicatiions by addition

        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        int number = input.nextInt();

        System.out.print("Multiplier: ");
        int multiplier = input.nextInt();

        int result = 0;

        for (int i = 0; i < multiplier; i++) {
            result += number;
        }

        System.out.println(number + " * " + multiplier + " = " + result);

    }
}
