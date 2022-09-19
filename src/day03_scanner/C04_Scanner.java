package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Scanner kullanmak icin 3 adim takip ediyoruz
        //1. adim kendimize bir scanner olusturmak


        Scanner scan= new Scanner(System.in); // esitligin saginda yeni bir scanner olusturulur
        //ve olusturulan bu scanner scan variable 'na assing edilir
        // scan variable' nin ismidir istedigimiz ismi verebiliriz
        //2. adim kullanicidan istedigimiz degeri girmesi icin aciklayici bir bilgi yazdirin
        System.out.println("Lutfen isminizi giriniz");

        //3. adim kullanicin girdigi degeri uygun bir variable olusturup kaydedin

        String kullaniciIsmi=scan.next(); // SADECE ilk kelimeyi alir (ilk space'e kadar olan bolumu alir)

        //scan.nextline tüm ismi alir

        System.out.println("Kullanicinin girdigi isim:" + kullaniciIsmi);


    }
}