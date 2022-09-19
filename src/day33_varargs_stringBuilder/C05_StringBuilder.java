package day33_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {
        /*
        compare 2 sb i esitmi kontrol etmek icin
         ilk harften baslayaraktum karakterleri karsilastirir
         ayni olan karakterler icin birsey yazdirmaz
         farkli olan ilk karakter icin ascii tablosuna gore kac deger ileride
         veya geride oldugunu yazdirir
         tamamen ayni ise bize 0 dondurur

         bir sb ile bir Stringi compare etmek istersek Java CTE verir
         */

        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Bli can");

        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2));//-1

        //System.out.println(sb1.compareTo(str));
        //sb da equals methodu String deki == gibi calisir
        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(sb1));//true

        System.out.println(sb1.equals(str));//false

        //System.out.println(sb1 == str);//farkli obje turlerinden oldugu icin java karsilastirma yapmaz




    }
}
