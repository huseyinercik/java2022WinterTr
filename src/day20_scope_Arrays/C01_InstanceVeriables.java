package day20_scope_Arrays;

public class C01_InstanceVeriables {

    int sayi;
    String bransIsmi="java";
    boolean okuldaMi;

    public static void main(String[] args) {
        //sayi=10; sayi veriable si static olmadigi icin main methodda direk kullanilamaz
        //instance veriablelere static methodlardan ulasabilmek icin obje olusturmamiz gerekir

        C01_InstanceVeriables obj1=new C01_InstanceVeriables();
        System.out.println(obj1.sayi);// 0 yazdirir. cunku bir deger atamadik
        obj1.sayi=10;
        System.out.println(obj1.sayi);// 10
        obj1.bransIsmi="SQL";
        System.out.println(obj1.okuldaMi); //false


        C01_InstanceVeriables obj2=new C01_InstanceVeriables();
        System.out.println(obj2.sayi);// 0
        System.out.println(obj2.bransIsmi);// java

        obj1.okuldaMi=true;

        System.out.println(obj2.okuldaMi);









    }
}
