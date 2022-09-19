package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler);//[Aykut, Yusuf, Ilker, Oguzhan]

        //remove (istenenObject) methodu istenen elementi kaldirip
        //bize true/false doner
        //eger remove isleminin yapildigini kontrol etmek istiyorsaniz
        //methodu boolean bir veriable ye atayabilirsiniz

        boolean sonuc = isimler.remove("Oguzhan");//true
        //sunucu kullaniciya yazdirmak isterseniz
        //if/else ile istediginiz degerlendirmeyi yapabilirsiniz

        if (sonuc == true) {
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediginiz isim listede olmadigindan silinemedi");
        }

        System.out.println(isimler);//[Aykut, Yusuf, Ilker]

        sonuc = isimler.remove("Berk");


        if (sonuc == true) {
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediginiz isim listede olmadigindan silinemedi");
        }

        //remove (index) yazdigimizda sildi/silmedim ihtimali kalmaz
        //bize remove edilen elementi doner

        System.out.println(isimler.remove(1));//Yusuf u siler ve dellil olarak Yusuf ismini bize dondurur

        //yazdirsakda yazdirmasakda liste degisti ve 1. indexteki element silindi
        System.out.println(isimler);//[Aykut, Ilker]


    }
}
