package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {

        String dosyaYolu = "src/day41_exceptions/dosya";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            int k = 0;
            while ((k=fis.read())!=-1) {
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {//FileNotFoundException
            e.printStackTrace();
        } catch (IOException e) {//IOException
            e.printStackTrace();
        }
        /*
        Exceptionlar icinde parent child iliskisi mevcuttur
        eger bir kod icin birden fazla exception olma ihtimali varsa
        oncelikle olasi exceptionlar parent child
        iliskisi tasiyormu bakmamiz gerekir
        eger parent child iliskisi yoksa
        istedigimiz sirada catch cumleleri kurabiliriz

        eger parent child iliskisi varsa
        sadece parent exceptionu yazabiliriz
        veya ikisinide yazmak istersek
        childi once parenti sonra yazmaliyiz
         */






        /*
        alti kirmizi cizili her kod cte degildir
        java Syntax hatalarini derleme esnasinda (compile) farkeder ve altini cizer
        biz bugune kadar tamamina CTE diyorduk.
        ancak exception konusu ile birlikte
        Compile Time Exception kavramida hayatimiza girdi
         */


    }
}
