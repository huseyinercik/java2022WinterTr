package day19_doWhileLoop;

public class C05_Scope {
    //1-bir method icerisinde olusturulan veriableler sadece olusturulduklari
    //  methodlarda kullanilabilirler baska methodlarda kullanilamazlar
    //2-tum methodlarin kullanabilmesini istedigimiz veriableleri 
    //  class level da olustururuz
    //  Class levelde olusturdugumuz veriableyi
    //  static yaparsak tum methodlar kullanabilir
    //  static olmazsa (instanca) ozaman sadece static olmayan methodlar kullanabilir
    //3-loop icinde olusturulan veriableler loop icerinde kullanilabilir
    //  ama loop un disinda kullanilamaz


    static String kurs = "Java";
    int level = 10;
    static int sayi4;

    public static void main(String[] args) {

        int sayi = 10;
        // isim="Veli Yan";
        System.out.println(kurs);
        //System.out.println(level);

        for (int i = 0; i < sayi; i++) {
            System.out.println(i);
            int loopsayi = 20;
        }
        //System.out.println(i);
        //loopsayi=30;

        int sayi2;
        sayi4++; //class seviyesinde olusturup deger atamadigim sayi4 u artirmama itiraz etmiyot
        //sayi2++; //ama method icinde olusturup deger atamadigim sayi2 yi artirmama izin vermiyor


    }

    public static void method1() {

        // sayi=20;
        String isim = "Ali Can";
        System.out.println(kurs);
        // System.out.println(level);

    }

    public void method2() {
        // sayi=30;
        // isim="Ayse San";
        System.out.println(kurs);
        System.out.println(level);

    }

}
