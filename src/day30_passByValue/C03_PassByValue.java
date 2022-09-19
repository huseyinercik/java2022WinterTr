package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        Java Pass By Value bir programlama dilidir
        yani bir primitive veriableyi argument olarak bir methoda yollarsaniz
        Java o veriableyi degil degerini (value) methoda aktarir (pass)
         */
        double etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra main methodda etiket fiyati : "+etiketFiyati+" tl");
    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {
        etiketFiyati=etiketFiyati*0.90;
        System.out.println("Sizin icin %10 indirimli fiyatimiz: "+etiketFiyati+" tl");
    }
}
