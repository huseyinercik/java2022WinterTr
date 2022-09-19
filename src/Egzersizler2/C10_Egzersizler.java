package Egzersizler2;

public class C10_Egzersizler {

    public static void main(String[] args) {

        //soru 1 String metodlarini kullanarak " Java ogrenmek 123 Cok guzel@ " Stringini
        //"Java ogrenmek cok guzel." sekline getirin

        String cumle = " Java ogrenmek 123 Cok guzel@ ";

        String yeniCumle = cumle.replace("123","");
         String yeniCumle1 = yeniCumle.replace("@",".");
         String yeniCumle2 = yeniCumle1.replace("C","c");
         String yeniCumle3  = yeniCumle2.trim();

        System.out.print("cumlenin yeni hali :"+yeniCumle3);


    }
}
