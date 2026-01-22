package org.example;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your choice of number: ");
//        String number = Integer.toString(input.nextInt());
//
//        System.out.println(number.length());

        int number = input.nextInt();
        int digit = 1;

        while (number > 9){
            number = number / 10;
            digit ++;
        }

        System.out.println("Number of digits: " + digit);

    }






}
