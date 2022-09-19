package day10_switch_StringManipulation;

public class C03_Concate {

    public static void main(String[] args) {

        //concatination yapmak icin iki ihtimalimiz var
        //istersek daha once yaptigimiz gibi + operatorunu kullaniriz
        //veya String class in concat metodunu kullaniriz

        String str1 = "Java";
        String str2 = "Candir";

        //Java Candir yazdiralim

        System.out.println(str1+" "+str2);

        String cumle=str1.concat(str2);// JavaCandir

        cumle=str1.concat(" ").concat(str2); //Java Candir

        System.out.println("cumle = " + cumle);


        //concat icine String degilde boolean bir deger yazsak nolur
        //concat metodu icine String parametre ister
        //String disinda bir data turu yazdigimizda onu String haline getirmelisiniz

        cumle=str1.concat(""+5);
        cumle=str1.concat(true+"");




    }
}
