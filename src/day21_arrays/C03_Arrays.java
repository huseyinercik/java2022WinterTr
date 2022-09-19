package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {


        int arr[];//deger atamasi yapmadik ama java kabul etti
        //arr[]={1,2,3};//boyle kabul etmiyor
        arr=new int[6];//bu sekilde kabul ediyor

        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0, 0]
        System.out.println(arr.length);//6
                                        //String deki length() parantez var, bunda yok

        //Array deki her bir elemani index degerinde kadar artiralim

        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=i;

        }
        System.out.println(Arrays.toString(arr));//[0, 1, 2, 3, 4, 5]

        //son index deki elementi yazdiralim
        System.out.println(arr[arr.length-1]);//5






    }
}
