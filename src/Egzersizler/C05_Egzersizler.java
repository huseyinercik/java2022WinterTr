package Egzersizler;

import java.util.Scanner;

public class C05_Egzersizler {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi girin:...");
        String isminiz= scan.nextLine();

        System.out.println("lutfen soyiminizi girin:...");
        String soyIsminiz= scan.next();

        System.out.println("isminiz: "+isminiz);
        System.out.println("soyisminiz: "+soyIsminiz);
        System.out.println("kursumuza katiliminiz onaylanmistir. Tesekkurler");


    }
}
