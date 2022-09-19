package day43_garbage_abstractClass;

public abstract class C04 {
   C04 (){
   }
    /*
    bir abstract classda abstract veya concrete methodlar bulunabilir
    child classlarin astract methodlari override etmesi MECBUR iken
    concrete methodlarin override edilmesi OPSIYONELDIR
     */
    public abstract void absMethod();

    public static void concreteMethod() {
        System.out.println("C04 Concrete method");
    }

    public static void concreteStaticMethod() {
        System.out.println("C04 concrete static method");
    }

    public static void main(String[] args) {
        /*
        abstract class lar constructor a sahiptir
        ancak abstract classlardan OBJE OLUSTURULAMAZ

        abstract classlar OBJE barindirmayan
        sadece child class lar icin UYULMASI SART OLAN veya
        OPSIYONEL birakilan ozellikleri
        tanimladigimiz bir depo class gibidir
         */
        //C04 obj=new C04();
        System.out.println("bu class abstract");
        concreteStaticMethod();


    }

}
