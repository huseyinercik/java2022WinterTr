package day09_ternary_Switch;

public class C03_Ternary {

    public static void main(String[] args) {

        int sayi=100;

        //verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol eden
        //ve sonucu yazdiran bir Ternary yazin

       String sonuc=sayi>=100 ? "sayi 3 basamakli ve daha buyuk" : "sayi negatif veya 3 basamaktan kucuk";

       //Ternary bize sonuc dondurdugu icin
        //ya bu sonucu direk yazdirmaliyiz
        //yada sonucun data turune uygun bir veriable ye atama yapabiliriz

        System.out.println("girdiginiz sayi analizi:  "+sonuc);


    }
}
