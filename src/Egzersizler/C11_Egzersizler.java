package Egzersizler;

import java.util.Scanner;

public class C11_Egzersizler {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen 4 basamakli bir tam sayi giriniz:...");

        int sayi= scan.nextInt();
        int rakam=0;
        int rakamlarToplami=0;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;



        System.out.println(rakamlarToplami);



    }
}
