package Egzersizler;

public class Ternary implements Interface{
    @Override
    public void carpma(int s, int z) {
        Interface.super.carpma(s, z);
        System.out.println(s*z);
    }

    public static void main(String[] args) {
       // int x=5;
       // System.out.println(x>2?x<4?10:8:7);
        System.out.println(x);
        Ternary obj=new Ternary();
        obj.carpma(2,9);





    }

    @Override
    public void toplama() {

    }

    public static void main(int[] args) {

    }

}
