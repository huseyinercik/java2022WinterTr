package Egzersizler;

import java.util.Scanner;

public class C33_Egzersizler {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (yas>=65) {
            System.out.println("emekli olabilirsiniz");
        }else if (yas<65) {
            System.out.println(65-yas+"yil sonra emekli olabilirsiniz");
            System.out.println("cok calisman lazim");
        }



    }
}
