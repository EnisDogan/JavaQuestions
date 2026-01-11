package org.example;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //a program to show addition of square of 2 numbers the user gave

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Result: ");
        System.out.println((number1 * number1) + (number2 * number2));

    }



}
