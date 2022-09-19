package day22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {
        //verilen array de istenilen elementin var olup olmadigini
        //true/false yazdirarak gosteren bir method olusturun

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi=60;

        istenenElemanVarMI(arr,istenenSayi);






    }

    private static void istenenElemanVarMI(int[] arr, int istenenSayi) {

        boolean sonuc=false;

        for (int i = 0; i <arr.length; i++) {

            if(arr[i] == istenenSayi){
                sonuc=true;
                break;
            }

        }
        System.out.println(sonuc);


    }
}
