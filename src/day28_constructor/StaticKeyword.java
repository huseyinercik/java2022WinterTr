package day28_constructor;

public class StaticKeyword {
    static int sayi1;
    int sayi2;

    public static void main(String[] args) {
        /*
        static veriableler direk class a baglidir
        class icerisinde yapilan her turlu degisiklik static veriablelerde kalici olur

        Instance veriableler ise obje ye baglidir
        instance veriable lere sadece obje uzerinden erisilebilir
        ve bir obje uzerinden erisilerek yapilan degisiklik
        instance veriablenin degerini tum objeler icin kalici olarak degistirmez
        sadece o obje icin instance veriable degerini kalici olarak degistirir
         */

        System.out.println("sayi1 : "+ sayi1);
        //System.out.println("sayi2 : "+ sayi2); static olmadigi icin main methoddan direk kullanamayiz

        StaticKeyword obj1=new StaticKeyword();
        System.out.println(obj1.sayi2);

        sayi1++;
        obj1.sayi2++;
        System.out.println("sayi1 : "+ sayi1);//1
        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1);//1

        StaticKeyword obj2=new StaticKeyword();
        System.out.println(obj2.sayi2);//0
        System.out.println(obj2.sayi1);//1

        obj2.sayi1++;
        obj2.sayi2++;

        System.out.println(obj2.sayi2);//1
        System.out.println(obj2.sayi1);//2

        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1);//2

        obj1.sayi1++;
        obj1.sayi2++;

        System.out.println(obj1.sayi2);//2
        System.out.println(obj1.sayi1);//3

        System.out.println(obj2.sayi2);//1
        System.out.println(obj2.sayi1);//3



    }


}
