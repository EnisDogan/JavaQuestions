package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) { //code for finding the biggest number in a list containing 10 different numbers
        Scanner input = new Scanner(System.in);

        List <Integer> numbers = new ArrayList<>();
        int counter = 0;
        int placament = 1;

        while (counter < 10){
            System.out.println("State your " + placament + "." + " number: ");
            int number = input.nextInt();
            numbers.add(number);
            counter++;
            placament++;
        }
        System.out.println(numbers);

        //with collection method

        Collections.sort(numbers);
        System.out.println(numbers.getLast());

        //with for loop

        int flag = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {

            if (numbers.get(i) > flag){
                flag = numbers.get(i);
            }

        }
        System.out.println(flag);

    }
}
