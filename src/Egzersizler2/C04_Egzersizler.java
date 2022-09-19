package Egzersizler2;

import java.util.Locale;
import java.util.Scanner;

public class C04_Egzersizler {


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyisminizi giriniz");
        String isim=scan.nextLine();



        System.out.println("isminizin ilk harfi: "+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("soyisminizin son harfi: "+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));
        System.out.println(isim.indexOf('e'));
        System.out.println(isim.length());

    }
}
