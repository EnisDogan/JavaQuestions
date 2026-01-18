package org.example;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dogum yilini giriniz: ");
        int dogumYili = input.nextInt();

        SimpleDateFormat sekil = new SimpleDateFormat("yyyy");
        Date tarih = new Date();
        int anlikYil = Integer.parseInt(sekil.format(tarih));

        int yas = anlikYil - dogumYili;

        System.out.println("Yasiniz: " + yas);

    }
}
