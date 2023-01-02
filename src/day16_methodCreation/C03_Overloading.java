package day16_methodCreation;


public class C03_Overloading {
    public static void main(String[] args) {
        //verilen 2 sayiyi toplayip yazdiran bir method olusturalim

        int sayi1 = 10;
        int sayi2 = 20;

        ikiSayiToplami(sayi1, sayi2);

        //iki double sayinin toplamini yazdiran bir Method olusturun

        double sayi3 = 15.2;
        double sayi4 = 10.3;

        ikiSayiToplami(sayi3, sayi4);

        //eger veriable olusturmadan direk sayilari yazarak method call yaparsam

        ikiSayiToplami(15, 25);
        ikiSayiToplami(10.1, 12.3);

        //bir int ile bir double toplamini yazdiran bir method olusturalim

        int sayi5 = 3;
        double sayi6 = 3.2;

        ikiSayiToplami(sayi5, sayi6); //method call da argument
        ikiSayiToplami(sayi5, sayi6);

        //
        //bir float ile bir short taplamini yazdiran bir method olusturali

        float sayi7=10.5f;
        short sayi8=5;
        ikiSayiToplami(sayi7,sayi8);

        byte sayi9=8;
        int sayi10=521;
        double sayi11=2518.26;
        ikiSayiToplami(sayi9,sayi10,sayi11);


    }

    private static void ikiSayiToplami(int sayi3, double sayi4) { // method da parametre

        System.out.println("bir integer bir double toplami: " + (sayi3 + sayi4));
    }

    private static void ikiSayiToplami(double sayi3, double sayi4) {

        System.out.println("iki double toplami: " + (sayi3 + sayi4));
    }

    private static void ikiSayiToplami(int sayi1, int sayi2) {

        System.out.println("iki integer toplami: " + (sayi1 + sayi2));
    }
    private static void ikiSayiToplami(float x,short y){
        System.out.println("Bir float ve bir short toplami: " + (x + y));
    }

   private static void ikiSayiToplami(byte x,int y,double z){
        System.out.println("Bir byte bir integer ve bir double in toplami: "+(x+y+z));
    }


}