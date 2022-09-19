package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {
        Cons01 obj1 = new Cons01();//default constructor devrede

        /*Cons01 class inda hic constructor olusturmazsak
         Java default constructor u kullandigindan
         obj1 uretebiliriz

        ancak biz parametreli veya parametresiz bir constructor yazdigimizda
         Java default constructoru siler

         dolayisiyla biz herhangi bir constructor olusturdugumuzda
         daha once baska class lar veya kullanicilarin
         olusturmus olabilecegi objeleri kullanabilmeleri icin
         default constructorun islevini gerceklestirecek
         parametresiz bir constructor olusturmakta fayda vardir

         */
        Cons01 obj2=new Cons01("Java");

    }
}
