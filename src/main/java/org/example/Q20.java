package org.example;

public class Q20 {//reverse an array of ints
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,9,8,7,6,5};

        reverseArray(arr);

    }
    public static void reverseArray(int [] arr){
        for (int i = arr.length -1; 0 <= i; i--) {
            System.out.print(arr[i] + ", ");
        }
    }
}
