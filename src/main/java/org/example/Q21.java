package org.example;

public class Q21 {// find min and max using the smallest number

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,12,32,45,10};
        findMinMax(arr);
    }
    public static void findMinMax(int [] arr){

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);

        int max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println(max);

    }
}
