package Egzersizler2;

import java.util.Scanner;

public class C03_Egzersizler {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println(sayi1<sayi2 ? sayi1 : sayi2);
    }
}
