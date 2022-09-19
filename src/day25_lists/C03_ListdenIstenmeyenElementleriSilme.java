package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_ListdenIstenmeyenElementleriSilme {
    public static void main(String[] args) {

        //verileen bir array den istenen elementi silip kalanlari
        //yeni bir array olarak yazdiran bir method olusturun

        int arr[] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};
        int istenmeyenEleman = 3;

        istenmeyenElementiSilVeYazdir(arr,istenmeyenEleman);


    }

    public static void istenmeyenElementiSilVeYazdir(int[] arr, int istenmeyenEleman) {

        List<Integer> yeniList=new ArrayList<>();

        for (int i = 0; i <arr.length; i++){
            if (arr[i]!=istenmeyenEleman){
                yeniList.add(arr[i]);
            }


        }
        System.out.println(yeniList);


    }
}
