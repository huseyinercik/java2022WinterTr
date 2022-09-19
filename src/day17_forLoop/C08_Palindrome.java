package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol
        // eden bir method yazin.


        String input = "java";

        palindromeKontrolEt(input);


    }

    private static void palindromeKontrolEt(String input) {
        String tertenInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            tertenInput += input.charAt(i);
        }
        System.out.println("girdiginiz kelimenin terten yazilisi: " + tertenInput);

        if (input.equalsIgnoreCase(tertenInput)) {
            System.out.println("girdiginiz kelime palindrome");
        } else {
            System.out.println("girdiginiz kelime palindrome degildir");
        }


    }
}
