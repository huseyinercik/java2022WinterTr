package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        //kullanicidan pozitif bir tam sayi alip
        // whileloop ile 5 ten kucuk pozitif tam sayilari yazdiralim

        int input = 1;

        int sayi = 1;
        int sayac = 1;

        while (sayi < input) {
            System.out.println("while loop: "+sayi);

            sayi++;
        }
        //ayni soruyu dowhileloop la yapalim
        sayi=1;
        do {
            System.out.println("do while loop: "+sayi);
            sayi++;
        }    while (sayi<input);


    }
}
