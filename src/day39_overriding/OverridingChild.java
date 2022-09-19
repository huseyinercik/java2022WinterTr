package day39_overriding;

public class OverridingChild extends OverridingParent{
    public void method1(){
        System.out.println("child class method1");
    }

    public static void main(String[] args) {

        /*
        bir obje olusturulurken data turu ve constructor ayni classdan secilmisse
        java direk o class a gider
        hem variable hemde method icin
        o class da varsa kullanir. yoksa o class in parentlerine bakar
         */
        OverridingChild obj1=new OverridingChild();
        obj1.method1();//child class method1
        obj1.method2();//parent class method2



        OverridingParent obj3=new OverridingParent();
        obj3.method2();//parent class method2
        obj3.method1();//parent class method1

        /*
        eger data turu parent constructor child classdan secildiyse
        variablelarda yukaridaki sekilde calisma devam eder
        ancak
        methodlar icin data turunun oldugu class daki method
        child class tarafindan Override edilmismi diye kontrol etmemiz gerekir
        eger child classlarda bu method override edilmisse
        override eden method calisir
         */
        OverridingParent obj2=new OverridingChild();
        obj2.method2();//parent class method2
        obj2.method1();//child class method1

    }
}
