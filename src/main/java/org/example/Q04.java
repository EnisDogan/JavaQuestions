package org.example;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        //a program to calculate division by subtraction

        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        int number = input.nextInt();

        System.out.print("Divider: ");
        int divider = input.nextInt();

        int counter = 1;
        while (number > divider){
            number = number - divider;
            counter++;

        }
        System.out.println("Result: " + counter);
    }
}
