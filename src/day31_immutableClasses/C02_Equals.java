package day31_immutableClasses;

public class C02_Equals {
    public static void main(String[] args) {
        String a = "";
        a += 2;
        a += 'c';
        a += false;

        if (a == "2cfalse") {
            System.out.println("a.==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("a.equals");
        }

        String b="2cfalse";
        if (b == "2cfalse") {
            System.out.println("b.==");
        }
        if (b.equals("2cfalse")) {
            System.out.println("b.equals");
        }


    }
}
