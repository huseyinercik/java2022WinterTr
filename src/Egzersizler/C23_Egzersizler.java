package Egzersizler;

import java.util.Scanner;

public class C23_Egzersizler {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kenar uzunlugunu girin");
        int birinciKenar= scan.nextInt();

        System.out.println("lutfen kenar uzunlugunu girin");
        int ikinciKenar=scan.nextInt();


        if (birinciKenar==ikinciKenar){
            System.out.println("verdiginiz bilgiler kare ye aittir");
        }
        if (birinciKenar!=ikinciKenar){
            System.out.println("verdiginiz bilgiler dikdortgene aittir");
        }




    }
}
