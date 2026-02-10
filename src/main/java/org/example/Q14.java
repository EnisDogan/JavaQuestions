package org.example;

public class Q14 {
    public static void main(String[] args) {
        //method for detecting wheter a word is polindrom or not.
        String text = "Reliefpfeiler";
        System.out.println(isPolindrom(text));


    }

    private static boolean isPolindrom(String text) {
       // text.toLowerCase();

        String reverse = "";

        for (int i =  text.length()-1; i >= 0; i--) {

            reverse = reverse + text.charAt(i);

        }
            if (text.equalsIgnoreCase(reverse)){
                System.out.println("Polindrom");
                return true;
            }else {
                System.out.println("not polindrom");
                return false;
            }



    }
}
