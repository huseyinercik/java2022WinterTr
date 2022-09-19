package day11_stringManipulation;

import java.util.Scanner;

public class C03_EqualsIgnoreCase {

    public static void main(String[] args) {

        //kullaniciya derse katilip katilmayacagini sorun
        //evet derse cevabini ve "derse katiliminiz alinmistir" yazdirin
        //hayir derse cevabini ve "sonraki derlerimize bekleriz" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("derse katilmak istermisiniz ? \nevet veya hayir yaziniz");
        String cevap=scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz: "+cevap+" derse katiliminiz onaylanmistir");
        }else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz: "+cevap+" sonraki derslere bekleriz");
        }else{
            System.out.println("lutfen evet veya hayir yaziniz");
        }
    }
}
