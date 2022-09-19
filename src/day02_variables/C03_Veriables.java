package day02_variables;

public class C03_Veriables {

    public static void main(String[] args) {

        String ogrenciIsmi="Melih";

        ogrenciIsmi="Furkan";

        //Bir veriable declare edildikten sonra istedigimiz kadar degisimi yapabiliriz
        //Ancak declare edilen bir veriable tekrar declare edilemez

        //String ogrenciIsmi="Abdullah";

        String isim, soyisim, dogumYeri;

        isim="Huseyin can";
        soyisim="Ercik";
        dogumYeri="Ceyhan";

        System.out.println(soyisim);
        System.out.println(dogumYeri);

        String tcNo="12345678901";
        String hiclik="";

        //String non-primitive oldugu icin biz sadece data saklamak degil
        //ekstra bazi ozellikleri de kullanabiliyoruz
        //eger tcNo , okul numarasi veya tel numarasi gibi
        //kendisi sayisal olan ancak matematiksel bir islevde kullanilamayan degerler icinde String kullanilabilir

        String harf="A";
        char harf2='A';

        //bu ikisi icinde ayni durum gecerli
        //ben A harfi icin bir varitable'i char olarak da olusturabilirim
        //eger sadece saklayacaksak char kullanilabilir ama
        //string ozelliklerinden istifade etmek icin string olarak tanimlamak daha avantajli olabilir
        System.out.println(tcNo);
        System.out.println(hiclik);
        System.out.println(harf);
        System.out.println(harf2);











    }
}
