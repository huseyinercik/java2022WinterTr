package day25_lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {

        //verileen bir array den istenen elementi silip kalanlari
        //yeni bir array olarak yazdiran bir method olusturun

        int arr[] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};
        int istenmeyenEleman = 5;

        istenmeyenElementiSil(arr, istenmeyenEleman);


    }






    public static void istenmeyenElementiSil(int[] arr, int istenmeyenEleman) {

        //1-istenmeyen eleman sayisini bulalim
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == istenmeyenEleman) {
                sayac++;

            }


        }
        //2-yeni array i olusturalim
        int arrYeni[] = new int[arr.length - sayac];

        //3-eski array den uygun olan elementleri yeniye tasi
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != istenmeyenEleman) {
                arrYeni[index] = arr[i];
                index++;
            }
        }
        //4-yeni array i yazdiralim+
        System.out.println(Arrays.toString(arrYeni));
    }
}
