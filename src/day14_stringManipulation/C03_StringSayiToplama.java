package day14_stringManipulation;

public class C03_StringSayiToplama {


    public static void main(String[] args) {

       //Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String str1 = “$13.99”
        // String str2 = “$10.55”
        // ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

        String str1 = "$13.99";
        String str2 = "$10.55";

        str1=str1.replaceAll("\\D",""); //String olarak 1399 oldu
        str2=str2.replaceAll("\\D",""); //String olarak 1055 oldu

        double str1Sayi = Double.parseDouble(str1); //ister parseDouble
        double str2Sayi = Double.valueOf(str2); // ister valueOf ikiside ayni sekilde calisir

        double sonuc = (str1Sayi+str2Sayi)/100;


        System.out.println("verilen String sayilarin toplami: $"+sonuc);





    }
}
