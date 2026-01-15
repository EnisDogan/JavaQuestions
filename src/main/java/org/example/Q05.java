package org.example;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        //code for calculating to the factor

        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        int number = input.nextInt();

        System.out.println(faktorCalculate(number));

    }

    private static int faktorCalculate(int number) {


        if (number == 0 || number == 1){
           return 1;
        }
        else {
            for (int i = number; i > 1; i--) {
                number = number*(i-1);

            }

        }
        return number;

    }


}
