package day36_inheritance;

public class Child extends Parent {


    Child() {
        super();

        System.out.println("Child cons. calisti");

    }
    //tum classlarda biz gormesek bile
    //javanin olusturdugu default cons. vardir

    //Extends keyword kullanan classlardaki
    //tum CONSTRUCTORlarin ilk satirinda
    // biz gormesek bile super()
    //constructor call vardir
    //yani parent class in parametresiz constructor call

    public static void main(String[] args) {
        Child child = new Child();

    }

}
