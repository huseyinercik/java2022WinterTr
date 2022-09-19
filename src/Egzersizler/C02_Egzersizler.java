package Egzersizler;

import java.util.Scanner;

public class C02_Egzersizler {

    public static void main(String[] args) {



        int sayi5=10;
        int sayi6=20;

        System.out.println("swap olmadan once :  "+sayi5+"-"+sayi6);

        sayi5=sayi5+sayi6;
        sayi6=sayi5-sayi6;
        sayi5=sayi5-sayi6;

        System.out.println("swap'tan sonra: "+sayi5+"-"+sayi6);



    }
}
