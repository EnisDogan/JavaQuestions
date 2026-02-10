package org.example;

public class Q15 {
    public static void main(String[] args) {
        //a program that identifies the smallest number among 10 others that are given by the user and returns its index
        int[] ah = {9,8,7,6,5,4,3,2,1,22};
        smallestOnesIndex(ah);
        
    }

    private static void smallestOnesIndex(int[] numbers) {

        int smallest = numbers[0];
        for (int i = 1; i < numbers.length ; i++) {
           if (numbers[i] < smallest){
               smallest = numbers[i];
           }
        }

        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == smallest){
                index = i;
            }
        }
        System.out.println(smallest + " is the smallest number \n  its index is " + index);
    }
}
