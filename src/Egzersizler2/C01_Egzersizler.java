package Egzersizler2;

import java.util.Scanner;

public class C01_Egzersizler {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi > 0) {

            System.out.println(sayi % 2 == 0 ? "girdiginiz sayi cifttir" : "girdiginiz sayi tektir");
        } else {
            System.out.println("hatali giris");
        }
    }
}
