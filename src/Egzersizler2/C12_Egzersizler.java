package Egzersizler2;

import java.util.Scanner;

public class C12_Egzersizler {
    public static void main(String[] args) {
        //kullanicidan isim - soyisim isteyin
        //hangisinin daha uzun oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyisminizi giriniz");
        String isim = scan.next();
        String soyIsim = scan.next();

        if (isim.length()>soyIsim.length()){
            System.out.println("isiminiz soyisminizden daha uzundur");
        }else{
            System.out.println("soyisminiz isminizden daha uzundur");
        }




    }
}
