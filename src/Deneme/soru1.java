package Deneme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru1 {
    /*Güzel bir Java sorusu:

Verilen bir list içerisinde (tekrarsız elemanlardan oluşan),
istenen toplama eşit olan her bir
sublisti yazdıran bir program yazınız.

Örnek 1:
List = {1,2,3,4,5,6};
istenen toplam: 8
1- {2,6}
2- {3,5}
3- {1,3,4}

Örnek 2:
List = {5,10,15,20};
istenen toplam: 30
1- {5,10,15}
2- {10,20}

     */
    public static void main(String[] args) {

        int list[] = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(list));

        int istenenToplam = 8;
        int istenenList[] = new int[6];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                for (int k = 0; k < list.length; k++) {
                    

                }

            }


            System.out.println(Arrays.toString(istenenList));
        }

    }
}
