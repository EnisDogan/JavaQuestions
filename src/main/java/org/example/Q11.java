package org.example;

import java.util.Random;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        //program that finds the given number in max 6 tries.
        Scanner input = new Scanner(System.in);
        System.out.println("State your number between 1-10: ");
        int chosenNumber = input.nextInt();

        int counter = 0;

        do {

            Random rd = new Random();

            for (int i = 1; i < 7; i++) {
                int number = rd.nextInt(1, 11);
                System.out.println("Random number: " + number + " Your chosen number: " + chosenNumber + " Counter: " + counter);
                if (chosenNumber == number) {
                    System.out.println("Your number was found!");
                    counter++;
                    return;
                } else {
                    counter++;
                }

            }

            if (counter == 6) {
                System.out.println("Your number could not be found...");
            }


        } while (counter < 6);

    }
}
