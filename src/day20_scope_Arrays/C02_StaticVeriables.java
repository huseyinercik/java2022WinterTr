package day20_scope_Arrays;

public class C02_StaticVeriables {

    //instance veriableler objeye bagimlidir ve her obje farkli deger alabilir
    //buna ornek olarak ogrenci notlari veya ogretmen branslari diyebiliriz
    //bir objeye ait bir veriablenin son degerini bulmak icin sadece o objeyi dikkate aliriz

    //sstatic veriableler ise class veriableler olarak tanimlanir
    //ve tum class uyeleri icin uygulanir . okul ismi okul mudurunun adi gibi
    //eger static variablenin degeri degistirilirse herkes icin degisir

    static String okulIsmi = "yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;


    public static void main(String[] args) {

        System.out.println(okulIsmi);//Yildiz Kolesi
        System.out.println(okulNo);//0
        okulNo = 102;
        System.out.println(okulNo); //102
        System.out.println(okulAcikMi); //false

        sttaticMethod();

        System.out.println(okulNo);//200

    }

    public static void sttaticMethod() {

        okulNo = 200;
        System.out.println(okulNo);//200
    }


}
