package org.example;

public class Q02 {
    public static void main(String[] args) {

        //result of cubes of numbers from 1 to 10 added together

        int sum = 0;
        int cube = 0;

        for (int i= 0; i < 11; i++) {
            cube = i * i * i;
            sum += cube;

        }

        System.out.println("Result: " + sum);
    }
}
