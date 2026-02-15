package org.example;

import java.time.LocalDateTime;
import java.util.Timer;

public class Q16 {
    public static void main(String[] args) { // a method for writing a word Backwards

        System.out.println(backwards("ali"));

    }
    public static String backwards(String word){
        int time = LocalDateTime.now().getNano();
        System.out.println(time);
        String newWord = "";
        for (int i =  word.length()-1; i >= 0; i--) {
            newWord += word.charAt(i);
        }
        int time2 = LocalDateTime.now().getNano();
        System.out.println(time2);
        System.out.println(time2 - time);
        return newWord;
    }
}
