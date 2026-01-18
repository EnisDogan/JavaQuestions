package org.example;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        //a program to calculate division by subtraction

        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        double number = input.nextDouble();

        System.out.print("Divider: ");
        double divider = input.nextDouble();

        double counter = 1;
        while (number > divider){
            number = number - divider;
            counter++;

        }
        System.out.println("Result: " + counter);
    }
}
