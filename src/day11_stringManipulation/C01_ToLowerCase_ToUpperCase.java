package day11_stringManipulation;

import java.util.Locale;

public class C01_ToLowerCase_ToUpperCase {

    public static void main(String[] args) {


        String str="Java Guzeldir";

        //biz String metotlarini arka arkaya kullanabiliriz
        //mesela ikinci kelimenin ilk harfini kucuk yazdiralim

        //str.charAt(5); boyle yazdigimizda sonuc artik String degil char olacaktir
        //dolayisiyla String de yapmak istedigimiz tum degisiklikleri once yapip
        //sonra charAt() metodunu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr"))); //JAVA GUZEDIR

    }
}
