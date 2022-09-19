package day19_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        // Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        // ve “Negatif sayi giremezsiniz” yazdirip basa donun
        // Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        // yanlislikla kac negative sayi girdigini
        // ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int sayacNegatif=0;
        int sayacPozitif=0;

        do {
            System.out.println("lutfen pozitif bir tam sayi girin \nbitirmek icin 0 a basin");
            sayi=scan.nextInt();
            if (sayi<0){
                sayacNegatif++;
                System.out.println("negatif sayi giremezsiniz");
            }else if (sayi>0){
                sayacPozitif++;
                toplam+=sayi;

            }

        }while (sayi!=0);
        System.out.print("Girilen pozitif sayilarin adedi: "+sayacPozitif);
        System.out.print("Yanlislikla girilen negatif sayilarin adedi: "+sayacNegatif);
        System.out.print("Girilen sayilarin toplami: "+toplam);













    }
}
