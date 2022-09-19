package day45_interface;

public interface I01_Default_Static {
    /*
    Interfacelerde sadece abstract methodlar bulunur
    bodysi olan conrete bir method olusturmak istedigimizde
    java CTE verir

    Ancak java 8 ve uzeri versiyonlarda istisnai olarak
    static veya default olarak tanimlanan methodlarin bodysi olabilir

    ancak burada kullanilan default keywordu access modifier
    degildir cunku interfacelerde tum methodlar public ve abstractti

    asagidaki ornekte gorulecegi gibi default olarak tanimlanmis
    bir methoda access modifier olarak public yazabilirisiniz
    (access modifier olarak yazmasakta java methodu public olarak kabul edecektir
     */


    void method1();

    public default void method2() {
        System.out.println("interface deki default method");
    }

    static void method3() {
        System.out.println("interface deki static method");

    }
}
