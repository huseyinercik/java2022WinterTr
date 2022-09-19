package day14_stringManipulation;

public class C05_SifreKontrol {
    public static void main(String[] args) {
        /*Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari
        sagliyorsa “Sifre basari ile tanimlandi”
        , sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
                - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali*/

       String sifre = "asdf12345";



        boolean ilkharf = false;


        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            ilkharf = true;
        }else{
            System.out.println("Sifrenizin ilk harfi buyuk olmali");
        }

        boolean sonHarf = false;

        if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
            sonHarf = true;
        }else {
            System.out.println("Sifrenizin son harfi kucuk olmalidir");
        }

        boolean bosluk = false;

        if (!sifre.contains(" ")){
            bosluk = true;
        }else{
            System.out.println("sifre bosluk icermemeli");
        }

        boolean uzunluk = false;

        if (sifre.length()>8){
            uzunluk = true;
        }else{
            System.out.println("sifre en az 8 karakter icermeli");
        }
        if (ilkharf && sonHarf && bosluk && uzunluk){
            System.out.println("sifreniz basarili bir sekilde kaydedildi");
        }





    }
}
