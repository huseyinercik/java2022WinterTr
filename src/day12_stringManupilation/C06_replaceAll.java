package day12_stringManupilation;

import java.util.Scanner;

public class C06_replaceAll {

    public static void main(String[] args) {

        //kullanicidan isim - soyisim bilgisini alip
        //butun harfleri * yapalim
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyismini girin");
        String isimSoyisim= scan.nextLine();

        System.out.println(isimSoyisim.replaceAll("\\S","*"));

    }
}
