package Egzersizler2;

import java.util.Scanner;

public class C11_Egzersizler {
    public static void main(String[] args) {
        //kullanicidan isim isteyin.eger
        //-isim "a" harfi iceriyorsa "Girdiginiz isim a harfi iceriyor"
        //-isim "Z" harfi iceriyorsa "Girdiginiz isim Z harfi iceriyor"
        //-ikiside yoksa"Girdiginiz isim a veya Z harfi icermiyor" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz:");
        String isim = scan.next();

        if (isim.contains("a")) {
            System.out.println("Girdiginiz isim a harfi iceriyor");
            if (isim.contains("Z")) {
                System.out.println("Girdiginiz isim Z harfi iceriyor");
            }
        }
        else {
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }
    }
}