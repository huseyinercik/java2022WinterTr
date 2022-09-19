package Egzersizler2;

import java.util.Scanner;

public class C06_Egzersizler {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz");
        int num1= scan.nextInt();
        int num2= scan.nextInt();

        System.out.println(num1<num2 ? num1 : num2);
    }
}
