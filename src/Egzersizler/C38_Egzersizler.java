package Egzersizler;

import java.util.Scanner;

public class C38_Egzersizler {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi yaziniz");
        String gunIsmi= scan.next().toLowerCase();

        if (gunIsmi.equals("pazar")){
            System.out.println("Pazar");
        }else if (gunIsmi.equals("pazartesi")){
            System.out.println("Pazartesi");
        }else if (gunIsmi.equals("sali")){
            System.out.println("Sali");
        }else if (gunIsmi.equals("carsamba")){
            System.out.println("Carsamba");
        }else if (gunIsmi.equals("persembe")){
            System.out.println("Persembe");
        }else if (gunIsmi.equals("cuma")){
            System.out.println("Cuma");
        }else if (gunIsmi.equals("cumartesi")){
            System.out.println("Cumartesi");
        }else System.out.println("lutfen gecerli gun ismi giriniz");
    }
}
