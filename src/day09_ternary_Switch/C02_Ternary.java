package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        //ternary ile yapilan tum islemler if else ilede yapilabilir
        //If else yerine ternary tercih etme sebebi yapinin basit ve anlasilabilir olmasidir
        //Ternary icerisinde kompleks kodlar olmaz
        //sadece sonuc veya sonuca goturen basit islemler olabilir

        //kullanicidan bir tam sayi alip tek mi cift mi yazdiran bir kod yazalim

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi cifttir");

        }else {
            System.out.println("sayi tektir");
        }
        System.out.println(sayi%2==0 ? "Sayi cift" : "Sayi tek");


    }
}
