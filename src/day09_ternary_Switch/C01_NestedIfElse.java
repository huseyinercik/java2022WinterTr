package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {

    public static void main(String[] args) {
        /*Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
        bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
        çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
                Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
        */
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 4 basamkali bir tam sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi<1000 || sayi>9999){ //istenmeyen durumu yaziyoruz
            System.out.println("lutfen 4 basamakli tam sayi giriniz");

        } else if (sayi%5==0){ //sayi 5 e tam bolunuyor

            if (sayi%10==0) { // 4 basamakli 5e bolunebilen ve son rakami sifir olan
                System.out.println("5e bolunebilen cift sayi");
            }else {
                System.out.println("5e bolunebilen tek sayi");
            }

        }else { // 4 basamakli ve 5e bolunemiyor
            System.out.println("tekrar deneyin");
        }


    }
}
