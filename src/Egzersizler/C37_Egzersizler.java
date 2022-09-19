package Egzersizler;

import java.util.Scanner;

public class C37_Egzersizler {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ucgenin birinci kenar uzunlugunu giriniz");
        int birinciKenar= scan.nextInt();
        System.out.println("lutfen ikinci kenar uzunlugunu giriniz");
        int ikinciKenar= scan.nextInt();
        System.out.println("lutfen ucuncu kenar uzunlugunu giriniz");
        int ucuncuKenar= scan.nextInt();

        if (birinciKenar==ikinciKenar && ikinciKenar==ucuncuKenar){
            System.out.println("girdiginiz uzunluklar eskenar ucgendir");
        }else System.out.println("girdiginiz uzunluklar eskenar ucgen degildir");



    }
}
