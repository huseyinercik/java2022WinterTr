package Egzersizler2;

public class C16_NestedForLoop {
    public static void main(String[] args) {
        /*
        A
        A B
        A B C
        A B C D
        A B C D E

         */

        char harf = 'E';

        for (char i = 'A'; i <= harf; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println("");

        }
    }
}
