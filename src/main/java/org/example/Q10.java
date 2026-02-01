package org.example;

import java.util.Scanner;

public class Q10 {

    // Write a program that calculates: (1/1) + (1+2)/2 + (1+2+3)/3 + ... + (1+2+3+...+n)/n

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("State your number: ");
        int number = input.nextInt();


        double result = 0;
        int n = 1;
        while (n <= number) {
            int sum = 0;
            int factor = 1;
            for (int i = 1; i <= n; i++) {

                sum += i;
            }

            for (int j = 1; j <= n; j++) {
                factor *= j;
            }

            result = (double) sum / factor;

            System.out.println(number + " " + sum + " " + factor);
            System.out.println("Result = " + result);

            n++;
        }
        System.out.println(result);

    }
}
