package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class C10_HomeWorkSayiBulmaca {
    public static void main(String[] args) {
        //bilgisayara 1-100 arasinda bir sayi tutturun
        //sonra kullanicidan bu sayiyi tahmin etmesini isteyin
        //girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        //kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu yazdirin
        //random sayi ekleme

        Random rnd = new Random();
        int sayi = rnd.nextInt(100); //burasi 100 den kucu rastgele bir sayi olusturur

        Scanner scan = new Scanner(System.in);
        int tahmin = 0;
        int sayac = 1;

        while (sayi != tahmin) {
            System.out.println("lutfen bir sayi giriniz");
            tahmin = scan.nextInt();

            if (tahmin > sayi) {
                System.out.println("daha kucuk bir sayi girin");

            } else if (tahmin < sayi) {
                System.out.println("daha buyuk bir sayi girin");


            }
            sayac++;


        }
        System.out.println("tuttugum sayiyi " + (sayac-1) + " tahminde buldunuz");


    }
}
