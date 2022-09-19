package day45_interface;

public class C02_Default_Static_Method implements I01_Default_Static{
    /*
    bir interface de default veya static olarak tanimlanan ve bodysi olan
    methodlarin override edilmesi mecburi degildir
    eger static olarak tanimlanmissa zaten override edemeyiz
     */

   /*
   parent interface deki default olarak tanimlanan methodu
   istersek override ederiz istersek etmeyiz
   override etmezsek method cagirildiginda parent intercafedeki calisir
   override edersek, child class'daki overriding method calisir

   @Override
    public void method2() {

        System.out.println("child class method2");

    }*/

    @Override
    public void method1() {
        System.out.println("child class method1");
    }

    public static void main(String[] args) {
        //interfacede static olarak tanimlanan methodlara
        //static yontemlerle ulasilabilir. InterfaceIsmi.methodIsmi
        I01_Default_Static.method3();
        C02_Default_Static_Method obj=new C02_Default_Static_Method();
        obj.method1();//child class
        obj.method2();//parent class
        //obj.method3(); eski class larda static bir uyeye
        //static olmayan yollarla da ulasabilirdik
        //ancak interface icerisinde static olarak tanimlanan methoda
        //static olmayan yontemlerle ulasilamaz


    }

}
