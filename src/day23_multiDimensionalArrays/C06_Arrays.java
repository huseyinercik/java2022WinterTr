package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        //verilen bir arraye yeni bir element ekleyen bir method olusturun

        int arr[] = {3, 5, 7, 5, 2};
        int eklenecekEleman = 1;

        arr = arrayeElemanEkleme(arr, eklenecekEleman);
        arr = arrayeElemanEkleme(arr, 11);

        System.out.println(Arrays.toString(arr));


    }

    public static int[] arrayeElemanEkleme(int[] arr, int eklenecekEleman) {

        int yeniArray[] = new int[arr.length + 1];//[0,0,0,0]
        for (int i = 0; i < arr.length; i++) {
            yeniArray[i] = arr[i];


        }

        yeniArray[yeniArray.length - 1] = eklenecekEleman;

        return yeniArray;
    }


}