package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("State your number: ");
        int number = input.nextInt();

        Integer sum = 0;


        List<Integer> dividers = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            if (number % i == 0){
                dividers.add(i);
                //sum += i;
            }

        }

        System.out.println("Dividers of your number are: " + dividers);
//
//        if (sum > number){
//            System.out.println(number + " is an abudand number.");
//        }else {
//            System.out.println(number + " is a deficent number.");
//        }

        System.out.println("method using list:");

        for (int i = 0; i < dividers.size(); i++) {
            sum = sum + dividers.get(i);
            System.out.println(sum);
        }
        if (sum > number){
            System.out.println(number + " is an abudand number.");
        }else {
            System.out.println(number + " is a deficent number.");
        }

    }
}
