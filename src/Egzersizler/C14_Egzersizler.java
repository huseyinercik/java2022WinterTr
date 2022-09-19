package Egzersizler;

import java.util.Scanner;

public class C14_Egzersizler {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ilk sayi giriniz:...");
        int num1= scan.nextInt();
        System.out.println("lutfen ikinci sayiyi giriniz:...");
      double num2= scan.nextInt();
        num1*=2;
        num2/=3;

        num1=(int) num2;



        System.out.println(num1*num2);


    }
}
