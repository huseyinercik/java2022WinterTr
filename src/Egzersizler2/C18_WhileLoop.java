package Egzersizler2;

import java.util.Scanner;

public class C18_WhileLoop {
    public static void main(String[] args) {

        int sayiAdedi = 3;
        int sayi = 0;
        int toplam = 0;

        Scanner scan = new Scanner(System.in);

        //for (int i = 1; i <= sayiAdedi; i++) {
        //   System.out.println("lutfen bir sayi giriniz");
        //  sayi = scan.nextInt();
        //  toplam += sayi;
        //}
       // System.out.println("girdiginiz "+sayiAdedi +" sayinin toplami: " + toplam);
        sayi=0;
        toplam=0;

        int sayac=1;
        ;
        while (sayac<=sayiAdedi){
            System.out.println("lutfen bir sayi giriniz")  ;
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;

        }
        System.out.println("girdiginiz "+sayiAdedi+" sayinin toplami: "+ toplam);


    }
}
