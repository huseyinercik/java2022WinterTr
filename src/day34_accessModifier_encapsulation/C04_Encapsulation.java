package day34_accessModifier_encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {
        /*
        bir variable i encapsule etmek icin
        1-access modofieri private yapariz
        2-okuma ve yazma ozelliklerinin kullanilmasini istedigimiz gibi sinirlayabiliriz
        eger sadece okunmasini istiyorsaniz getter
        sadece deger girilebilsin isterseniz setter
        methodlarini olustururuz

        bir variable icin hem getter hen setter olusturursaniz
        o variable public olmus gibi
        hem okuyup hemde yazilmasini saglayabilirsiniz

        piyasada developer lar arasinda genel uygulamada boyledir

         */

        C03 obj=new C03();
        System.out.println(obj.getSayi());//0

        obj.setStr("Java Java Java");
        System.out.println(obj.getStr());//Java Java Java

        System.out.println(obj);//sayi=0, str=Java Java Java

    }
}
