package day11_stringManipulation;

import java.util.Scanner;

public class C05_indexOf {

    public static void main(String[] args) {

        String str1="Java bir baska guzel valla cok guzel";
        //istersek char olarak verdigimiz bir harfin indexini bize dondurur

        System.out.println(str1.indexOf('J')); //0

        //istesek bir harf yada metin olarak verdigimiz String in indexini dondurur

        System.out.println(str1.indexOf("l")); //19
        System.out.println(str1.length()-1); //35
        System.out.println(str1.indexOf("aska")); //10

        //ayni harften birden fazla varsa?

        System.out.println(str1.indexOf("b")); //5 buldugu ilk dogru eslesmenin indexini dondurur

        System.out.println(str1.indexOf('b',5));
        //bu metotda java aramaya fromindex olarak yazdigimiz index ten baslar
        //(inclusive)

        //verilen String deki ikinci a harfinin indexini bulalim
        int ilkIndex= str1.indexOf('a'); // 1
        System.out.println(str1.indexOf('a',ilkIndex+1)); //3



        int ilkBIndex= str1.indexOf('b'); // 1
        System.out.println(str1.indexOf("b",ilkIndex+1));

        //20.indexte sonra guzel aratalim
        System.out.println(str1.indexOf("guzel",20)); //31

        //String de olmayan bir harf aratsak?
        System.out.println(str1.indexOf("y")); // y yok demesi lazim ama return type i index
        // yok demenin sayisal karsiligi olarak java -1 dondurmeyi tercih etmistir

        //kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin
        //iceriyorsa mailiniz kabul edildi yazin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen mailinizi yazin");
        String mail=scan.next();

        if (mail.indexOf("@")==(-1)){
            System.out.println("gecersiz");
        }else {
            System.out.println("mailiniz kabul edildi");
        }
        //ozet : indexof metodu icerisine yazilan String veya char in
        // metinde hangi index te oldugunu bize dondurur
        //eger aradigimiz metin veya char yoksa olmadiginin delili olarak
        // bize -1 dondurur



    }
}
