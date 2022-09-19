package Egzersizler;

import java.util.Scanner;

public class C36_Egzersizler {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen maas teklifinizi belirtin");
        int maas= scan.nextInt();

        if (maas<60000){
            System.out.println("teklifinizi maalesef kabul edemem");
        }

        else if (maas<80000){
            System.out.println("konusabiliriz");
        }

        else {
            System.out.println("teklifinizi kabul ediyorum");
        }


    }
}
