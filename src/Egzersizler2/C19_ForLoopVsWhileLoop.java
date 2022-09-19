package Egzersizler2;

import java.util.Scanner;

public class C19_ForLoopVsWhileLoop {
    public static void main(String[] args) {

        int sayi=1;
        int toplam=0;
        Scanner scan=new Scanner(System.in);


        while (sayi!=0){
            System.out.println("lutfen bir sayi girin");
            sayi= scan.nextInt();
            toplam+=sayi;


        }
        System.out.println(toplam);




    }
}
