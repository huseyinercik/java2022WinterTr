package Egzersizler;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class C25_Egzersizler {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunismi= scan.next().toUpperCase();

        if (gunismi.equals("CUMARTESI") || gunismi.equals("PAZAR")){
            System.out.println("girdiginiz gun haftasonudur");
        }else if (gunismi.equals("PAZARTESI") || gunismi.equals("SALI") ||
        gunismi.equals("CARSAMBA") || gunismi.equals("PERSEMBE") ||
        gunismi.equals("CUMA")){
            System.out.println("girdiginiz gun haftaicidir");
        }else System.out.println("lutfen gecerli bir bilgi girin");
    }
}
