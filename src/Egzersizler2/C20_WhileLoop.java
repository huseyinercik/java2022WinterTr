package Egzersizler2;

import java.util.Scanner;

public class C20_WhileLoop {
    public static void main(String[] args) {

        int sayi=0, toplam=0 ,limit=50;

        Scanner scan=new Scanner(System.in);

        while (toplam<limit){
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;

        }
        System.out.println("artik yeter girdiginiz sayi "+ limit+ " limitini gecti toplam: "+toplam);


    }
}
