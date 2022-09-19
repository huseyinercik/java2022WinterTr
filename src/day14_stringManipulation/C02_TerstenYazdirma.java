package day14_stringManipulation;

public class C02_TerstenYazdirma {

    public static void main(String[] args) {


        //Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

        String inPut = "Mavi";

        String terStr = inPut.substring(3).toUpperCase() +
                inPut.substring(2, 3) .toLowerCase()+
                inPut.substring(1, 2) .toLowerCase()+
                inPut.substring(0, 1).toLowerCase();

        System.out.println(terStr);


    }




}
