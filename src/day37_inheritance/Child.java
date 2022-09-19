package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
    //bir classi child class yaptigimizda
    //parent class daki constructor a ulasmasi gerekir
    //bu durumda parent class daki constructorin
    //access modifieri uygun bir modifier olmalidir(protected)



    Child(){
        super();
        System.out.println("Child class parametresiz cons.");

    }Child(int s){
        //child class da tum cons. ilk satirina
        //javanin yerlestirdigi constructor PARAMETRESIZ dir yani super()'dir
        System.out.println("Child class parametreli cons.");
    }Child(int sayi1,int sayi2){
        //eger parent class dan parametresiz cons. degilde
        //baska bir cons. calistirmak isterseniz
        //bunu child class daki constructorun ILK SATIRINA yazmalisiniz
        super(sayi1,sayi2);
        System.out.println("iki parametreli constructor");
    }

    public static void main(String[] args) {
        Child child=new Child(5,8);
    }
}
