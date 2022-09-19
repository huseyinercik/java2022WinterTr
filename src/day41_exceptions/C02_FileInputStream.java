package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args)  {

        /*
        bir kod yazilirken olasi exceptionlar on gorulup
         ona gore exception olustugunda javanin
        ne yapmasini istedigimiz belirtilmelidir

        1-eger exception olustugunda kodun calismaya devam etmesini istemiyorsak
        method isminin yanina olusabilecek exceptionu deklare edbiliriz

        2-eger exception olussada kodun calismasina devam etmesini istiyorsak
        sorun olusturabilecek kodu try catch blogunun icine alir
        try bloguna sorun cikabilecek kodu
        catch bloguna olusabilecek exception i ve olasi
        exception durumunda javanin ne yapmasini istedigimizi yazabiliriz
         */

        String dosyaYolu = "src/day41_exceptions/dosya";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
