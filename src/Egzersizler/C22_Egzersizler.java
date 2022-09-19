package Egzersizler;

import java.util.Scanner;

public class C22_Egzersizler {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gun= scan.next().toLowerCase();

        if (gun.equals("pazar") || gun.equals("cumartesi")) {
            System.out.println("girdiginiz gun haftasonu gunlerindendir");
        }
        else if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") ||
        gun.equals("cuma")) {
            System.out.println("girdiginiz gun hafta ici gunlerindendir");
        }
        else System.out.println("dalgami geciyorsun arkadasim");
        }
    }

