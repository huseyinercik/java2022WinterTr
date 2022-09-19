package Egzersizler2;

import java.util.Scanner;

public class C09_Egzersizler {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int num = scan.nextInt();

        System.out.println( num>0 ? "sayi pozitif" : "sayi negatif");
    }
}
