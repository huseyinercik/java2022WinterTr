package Egzersizler2;

public class C17_WhileLoop {
    public static void main(String[] args) {

        int baslangic=20;
        int bitis=50;

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i+" ");

        }
        System.out.println("");

        int i=baslangic;

        while (i<=bitis){
            System.out.print(i+ " ");
            i++;
        }
        System.out.println("");
        System.out.println(baslangic);
    }
}
