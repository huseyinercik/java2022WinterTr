package Egzersizler2;

import java.util.Scanner;

public class C07_Egzersizler {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int num=scan.nextInt();

        System.out.println(num%2==0 ? "sayi cift" : "sayi tek");


    }
}
