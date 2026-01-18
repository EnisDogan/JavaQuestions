package org.example;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("State the year of your birth: ");
        int yearOfBirth = input.nextInt();

        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        Date date = new Date();
        int actualYear = Integer.parseInt(format.format(date));

        int age = actualYear - yearOfBirth;

        System.out.println("Your age: " + age);

    }
}
