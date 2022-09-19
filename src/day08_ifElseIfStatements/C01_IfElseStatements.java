package day08_ifElseIfStatements;

import java.util.Scanner;

public class C01_IfElseStatements {public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("lutfen bir karater giriniz");
    char karakter = scan.next().charAt(0);

    if ((karakter >= 'A' && karakter <= 'Z') || (karakter >= 'a' && karakter <= 'z')) {
        System.out.println("girdiginiz karater harftir");
    } else {
        System.out.println("girdiginiz karakter harf degildir");
    }


    }
}





