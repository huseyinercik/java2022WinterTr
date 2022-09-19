package Egzersizler2;

public class C14_Egzersizler {
    public static void main(String[] args) {
        //Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa "Sifre basari ile tanimlandi"
        // sartlari saglamazsa "Islem basarisiz,Lutfen yeni bir sifre girin" yazdirin
        // - Ilk harf buyuk harf olmali
        // - Son harf kucuk harf olmali
        // - Sifre bosluk icermemeli
        // - Sifre uzunlugu en az 8 karakter olmali
        // bu 4 kontrolu method ile yapin

        String sifre="Emir123a";
        boolean ilkHarfKontrol=ilkHarfKontrolEt1(sifre);
        boolean sonHarfKontrol=sonHarfKontrolEt1(sifre);
        boolean boslukKontrol=boslukKonrolEt1(sifre);
        boolean uzunlukKontrol=uzunlukKonrolEt1(sifre);

        if (ilkHarfKontrol && sonHarfKontrol && boslukKontrol && uzunlukKontrol){
            System.out.println("sifreniz kabul edildi");
        }else{
            System.out.println("sifreniz kabul edilmedi tekrar deneyin");
        }


    }

    private static boolean uzunlukKonrolEt1(String sifre) {
        boolean uzunlukSonuc=false;
        if (sifre.length()>=8){
            uzunlukSonuc=true;

        }else{
            uzunlukSonuc=false;
            System.out.println("sifrenizin uzunlugu 8 karakter olmali");
        }return uzunlukSonuc;
    }

    private static boolean boslukKonrolEt1(String sifre) {
        boolean boslukSonuc=false;
        if (!sifre.contains(" ")){
            boslukSonuc=true;

        }else{
            boslukSonuc=false;
            System.out.println("sifreniz icinde bosluk olmamali");
        }return boslukSonuc;
    }

    private static boolean sonHarfKontrolEt1(String sifre) {
        boolean sonHarfSonuc=false;
        char sonHarfKontrol=sifre.charAt(sifre.length()-1);
        if ((sonHarfKontrol>='a') && (sonHarfKontrol<='z')){
            sonHarfSonuc=true;

        }else {
            sonHarfSonuc=false;
            System.out.println("sifrenizin son karakteri kucuk harf olmali");
        }
        return sonHarfSonuc;
    }

    private static boolean ilkHarfKontrolEt1(String sifre) {
        boolean ilkHarfSonuc=false;
        char ilkHarfKontrol=sifre.charAt(0);
        if ((ilkHarfKontrol>='A') && (ilkHarfKontrol<='Z')){
            ilkHarfSonuc=true;

        }else{
            ilkHarfSonuc=false;
            System.out.println("sifrenizin ilk karakteri buyuk harf olmali");
        }
        return ilkHarfSonuc;
    }
}
