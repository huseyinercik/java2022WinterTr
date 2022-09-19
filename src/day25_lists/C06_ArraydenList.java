package day25_lists;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C06_ArraydenList {
    public static void main(String[] args) {
        //verilen bir array i listeye cevirin

        String arr[] = {"A","B","C"};
        List<String> arraydenList=Arrays.asList(arr);
        //arrayden liste cevirdigimiz zaman yeni listin uzunlugunu ceviremeyiz
        //dolayisiyla bu yeni list ile add() remove() clear() gibi methodlar calistirmak istedigimizde Exception olusur

        //arraydenList.add("j");//UnsupportedOperationException
        System.out.println("17. satirda list : "+arraydenList);//[A, B, C]
        arr[1]="F";

        System.out.println("20. satirda Array :"+Arrays.toString(arr));//[A, F, C]
        System.out.println("21. satirda List :"+arraydenList);//[A, F, C]

        arraydenList.set(0,"Y");

        System.out.println("25. satirda Array :"+Arrays.toString(arr));//[Y, F, C]
        System.out.println("26. satirda List :"+arraydenList);//[Y, F, C]

    }
}
