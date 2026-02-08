package org.example;

public class Q13 {
    public static void main(String[] args) {

        //a repeading mathed that returns only the sum of negative numbers in the arraylist

        int[] arr = {1, 2, 3, 4, -5, -6, -7};
        int index = 0;
        System.out.println(recursive(arr, index));
    }

    public static int recursive (int [] arr, int index) {

        if (index == arr.length) {
            return 0;
        }
        int current = arr[index];

        if (current < 0) {
            return current + recursive(arr, index + 1);
        } else {
            return recursive(arr, index + 1);
        }

    }


}
