package org.example;

public class Ders1 {
    public static void main(String[] args) {
        String a = "Mustafa";
        String b = new String("Mahmut");

        System.out.println(b);

        System.out.println("Harf Sayisi: " + b.length());

        System.out.println("0. Index: " + b.charAt(0));

        for (int i = 0; i < b.length(); i++) {
            System.out.println(b.charAt(i));
        }

        System.out.println(b.startsWith("Mu"));
        System.out.println(b.endsWith("ut"));
        System.out.println(b.indexOf("t"));
        System.out.println(b.lastIndexOf("M"));

        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());

        String c = "1923";
        int d = Integer.parseInt(c);
        System.out.println(d);
    }
}
