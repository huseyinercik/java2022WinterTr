package Egzersizler;

import java.util.Scanner;

public class C21_Egzersizler {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char ilkHarf=scan.next().toUpperCase().charAt(0);

        if (ilkHarf=='P'){
            System.out.println("Pazartesi , Persembe , Pazar");
        }else if (ilkHarf=='S'){
            System.out.println("Sali");
        }else if (ilkHarf=='C'){
            System.out.println("Carsamba , Cuma , Cumartesi");
        }else System.out.println("lutfen baska bir harf giriniz");


    }
}
