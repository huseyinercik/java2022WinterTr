package Egzersizler;

import java.util.Scanner;

public class C20_Egzersizler {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz:..");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("girilen sayi cifttir");
        }else System.out.println("girilen sayi tektir");
    }
}
