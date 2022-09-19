package day24_lists;


import day23_multiDimensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {

        int arr[] = {};
        // bu array'e 5 ekleyelim

        C06_Arrays obj = new C06_Arrays();
        arr = obj.arrayeElemanEkleme(arr, 5);
        System.out.println(Arrays.toString(arr)); //[5]

        // bir de 3 ekleyelim

        arr = obj.arrayeElemanEkleme(arr, 3);
        System.out.println(Arrays.toString(arr)); // [5, 3]

        // bir liste olusturalim

        List<Integer> sayilarList = new ArrayList<>();
        sayilarList.add(4);
        sayilarList.add(7);
        System.out.println(sayilarList); // [4, 7]



    }
}
