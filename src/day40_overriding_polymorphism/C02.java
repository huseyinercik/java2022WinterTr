package day40_overriding_polymorphism;

public class C02 extends C01 {

    private void method4(){
        System.out.println("child method");
        //parent class daki private method4 e
        //child classdan ulasmamiz mumkun olmadigindan
        //java bu iki methodu
        //TAMAMEN FARKLI IKI METHOD olarak kabul eder
        //@Override kullanmak istersek java kabul etmez CTE verir
    }


    @Override
    String method3(){
        return "java";
    }

    @Override
    public void method2() {
        System.out.println("child method2");
        /*
        @Override notasyonu overridden method ile overriding methodu
        birbirine baglar
        farkinda olunmadan overriden method silinirse veya signature degistirilirse
        bu iliski bozulacagi icin java CTE verir

        notasyon kullanilmazsa java bunlarin iliskisini bilir ama
        overriden method silinirse sesini cikarmaz(itiraz etmez)
         */
    }

    public static void main(String[] args) {

        C02 obj = new C02();

        obj.method1();//parent method1
        obj.method2();//child method2


        C01 obj2 = new C02();
        obj2.method1();//parent method1
        obj2.method2();//child method2

        C01 obj3 = new C01();
        obj3.method1();//parent method1
        obj3.method2();//parent method2

    }
}
