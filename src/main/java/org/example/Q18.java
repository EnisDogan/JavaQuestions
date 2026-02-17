package org.example;

import java.util.Scanner;

public class Q18 {//a code for calculating a spheres area and volume with the radius given by the user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("State the radius");
        double radius = scanner.nextDouble();

        double pi = 3.14;

        double volume = (pi * 4 * radius * radius * radius) / 3;
        System.out.println("the volume of the sphere is: " + volume);

        double area = 4 * pi * radius * radius;
        System.out.println("the area of the sphere is: " + area);
    }
}
