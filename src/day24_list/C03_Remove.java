package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<Integer>();
        sayilar.add(5);//[5]
        sayilar.add(3);//[5,3]
        sayilar.add(0,7);//[7,5,3]
        sayilar.add(2,7);//[7,5,7,3]

        sayilar.remove(3);//index olarak 3 deki elementi siler
        //sayilar.remove(5); //IndexOfBoundsException

        /*
        sayilardan olusan bir litt te objeyi vererek element silme methodu calismaz
        sayi degeri girdigimizde java otomatik olarak sayiyi index kabul eder

         */
        //int sayi=5
        //sayilar.remove(sayi);//IndexOfBoundsException

        Integer sayi=5;// Integer wrapper class i tanimlayinca sayi obje oldugundan bu method calisti
        sayilar.remove(sayi);
        System.out.println(sayilar);//[7,7]

        //sayilar.remove(Integer.valueOf("5")):


    }
}
