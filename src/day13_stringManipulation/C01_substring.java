package day13_stringManipulation;

public class C01_substring {

    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5));//ile IT cok guzel yazdirdi
        //yukaridaki Stringi kullanarak Mehmet hoca ile IT cok guzel

        System.out.println(str.replace("Java", "Mehmet hoca"));
        System.out.println("Mehmet hoca "+str.substring(5));

        System.out.println(str.substring(9));// yazilan index inclusive(dahil)

        //eger bir indexten sona kadar olan parcayi degil
        //belirli bir parcayi almak istersek
        //2 parametre yazmak gerekiyor str.substring(baslangicIndexi , bitisIndexi)
        //baslangic indexi ==> inclusive dir  ( dahildir)
        //bitis indexi ==>eclusive/haric

        System.out.println(str.substring(0,5)); //Java
        System.out.println(str.substring(0,1)); //J

        //bana 6. harfi String olarak bulun
        String harf=str.substring(5,6);
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7,7));//hiclik" dondurur
        //System.out.println(str.substring(5,2));// bitis indexi baslangic indexinden kucuk olamaz

        System.out.println(str.substring(str.length()-1));//son harfi -1 le verir
        System.out.println(str.substring(str.length()-5));//son 5 harf i dondurur
        System.out.println(str.substring(str.length()));//son harften sonraki kismi yani hiclik verir


    }
}
