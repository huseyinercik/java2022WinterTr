package Egzersizler2;

import java.util.Scanner;

public class C08_Egzersizler {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi girin");
        int sayi = scan.nextInt();

        System.out.println(sayi>=0 ? sayi : (1-1)*sayi) ;


    }
}
