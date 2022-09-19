package Egzersizler2;

import java.util.Scanner;

public class C02_Egzersizler {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println(sayi>=0? sayi : (1-1)*sayi);
    }
}
