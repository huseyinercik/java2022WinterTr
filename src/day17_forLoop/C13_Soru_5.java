package day17_forLoop;

public class C13_Soru_5 {

    /*

    //Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin.
    // 1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.

    int sayi=57;

        for (int i = 1; i <=sayi ; i++) {
        if (i%3==0){
            System.out.print(i + " ");
}
     */
    public static void main(String[] args) {
        int sayi=88;

        for (int i = 1; i <sayi-1 ; i++) {
            if (i%3==0){
                System.out.print(i+", ");
            }

        }
        System.out.println(87);
    }
}