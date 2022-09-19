package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C02_Update {
    public static void main(String[] args) {
        //Verilen map deki tum branslari Java yapalim
        //verilen map deki numarasi 102 olan ogrencinin bransini java yapalim

        /*
        map de valoe kompleks olabildigi icin valoe icerisinden bir bolumu
        degistrimek istersek once value ulasmak sonra onu manuple ederek
        istedigimiz degisikligi yapmak ve en son degismis halini
        yeniden  map e eklmek gerekir
         */
        Map<Integer,String> sinifListMap= MapOlustur.myMap();
        System.out.println(sinifListMap);

        Set<Map.Entry<Integer,String>> sinifEntrySet=sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each:sinifEntrySet
             ) {
            Integer keyEntry=each.getKey();
            String valueEntry=each.getValue();
            String valueArr[]=valueEntry.split(", ");
            valueArr[2]="java";

            String valueYeni=valueArr[0]+", "+valueArr[1]+", "+valueArr[2]+", "+valueArr[3];

            sinifListMap.put(keyEntry,valueYeni);
        }
        System.out.println(sinifListMap);
    }
}
