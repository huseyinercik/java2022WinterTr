package day30_passByValue;

public class C02_StaticBlocks {
    {
        /*
        static olmayan bloklar ise obje olusturulurken calisir

        static bloklar sadece 1 kere calisir ama
        static olmayan bloklar her obje olusturulurken yeniden calisir
         */





        System.out.println("statik olmayan blok calisti");
    }
    static{
        System.out.println("static blok calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method basi");

        C02_StaticBlocks obj1=new C02_StaticBlocks();
        C02_StaticBlocks obj2=new C02_StaticBlocks();
    }
}
