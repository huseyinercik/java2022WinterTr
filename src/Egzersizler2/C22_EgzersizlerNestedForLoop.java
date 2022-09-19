package Egzersizler2;

import java.util.Scanner;

public class C22_EgzersizlerNestedForLoop {
    public static void main(String[] args) {

        // kullanicidan bir rakam alip carpim tablosu olusturalim


        //1 2 3    1*1 1*2 1*3
        //2 4 6    2*1 2*2 2*3
        //3 6 9    3*1 3*2 3*3

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= sayi; j++) {



                    System.out.print((i * j ) + " ");


                }



            System.out.println("");

        }


    }
}
