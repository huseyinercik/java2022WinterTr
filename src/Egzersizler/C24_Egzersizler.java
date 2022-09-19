package Egzersizler;

import java.util.Scanner;

public class C24_Egzersizler {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunIsmi= scan.next().toLowerCase();

        if (gunIsmi.equals("cuma")){
            System.out.println("muslumanlar icin kutsal gun");
        }else if (gunIsmi.equals("cumartesi")){
            System.out.println("yahudiler icin kutsal gun");
        }else if (gunIsmi.equals("pazar")){
            System.out.println("hiristiyanlar icin kutsal gun");
        }else if (gunIsmi.equals("pazartesi")){
            System.out.println("hafta baslangici");
        }else if (gunIsmi.equals("sali")){
            System.out.println("sali sallanir");
        }else if (gunIsmi.equals("carsamba")){
            System.out.println("carsamba carsafa dolanir");
        }else if (gunIsmi.equals("persembe")){
            System.out.println("persembe perisanliktir");
        }else System.out.println("la bi isine git");




    }
}
