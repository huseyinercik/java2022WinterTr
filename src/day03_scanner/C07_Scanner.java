package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        String okulIsmi="Ayse Malaz Ilkokulu";
        System.out.println(okulIsmi);

        char ilkSayi,ilkHarf,ilkSembol;
        ilkSayi='9';
        ilkHarf='A';
        ilkSembol='%';
        System.out.println(ilkHarf);
        System.out.println(ilkSayi);
        System.out.println(ilkSembol);

        int sayi1=20, sayi2=10, sayi3=50,sayi4=2;
        System.out.println(sayi1+sayi2);
        System.out.println(sayi3-sayi4);
        System.out.println(sayi2*sayi3);

        String isim="Nefise";
        String soyIsim="Ercik";
        System.out.println("isminiz:  "+isim);
        System.out.println("Soyisminiz:  "+soyIsim);

        String isim1="Emir";
        String soyisim1="Ercik";
        System.out.println("Adınız: "+ isim1 );
        System.out.println("Soyadınız:  "+soyisim1);

        short sayi5=100;
        double sayi6=90.80;
        System.out.println(sayi5+sayi6);

        char sembol='&';
        System.out.println(sembol);

        int sayi7=98;
        char harf='z';
        System.out.println(sayi7+harf);

        int sayi8=10;
        int sayi9=20;
        System.out.println("Swap'dan once sayi8:   " +  sayi8  +", sayi9:   "+sayi9);

        int temp=sayi8;
         sayi8=sayi9;
         sayi9=temp;
        System.out.println("Swap'dan sonra sayi8:   " +  sayi8  +", sayi9:   "+sayi9);

        int a=10;
        int b=20;
        System.out.println("Swap'dan once a: " + a +", b:  " +b);
        a=a+b;//a=10+20=30
        b=a-b;//b=30-20=10
        a=a-b;//a=30-10=20
        System.out.println("Swap'dan sonra a: " + a +", b:  " +b);

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi girin");

        String kullaniciIsmi= scan.nextLine();

        System.out.println("kullanicinin girdigi isim:  " +kullaniciIsmi);
























    }
}
