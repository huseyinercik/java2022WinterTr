package day43_garbage_abstractClass;

public abstract class C03_IlkAbstractClass {

    public abstract void AbstractMethod();
    /*
    abstract methodlar child class larin mutlaka
    override etmesi gereken methodlardir
    dolayisiyla hic bir zaman direk calistirilmazlar
    ve bu sebeple method body sine ihtiyac yoktur



    bir class in yada methodun abstract olup olmadigini anlayabilirmiyiz?
    abstract yaziyorsa abstract ir yazmiyorsa degildir
    (abstract olmayan class lara concrete class/method denir)

    Abstract methodlar bodye sahip olamaz
    Concrete methodlar ise method body si olmadan olusturulamaz
     */

}
