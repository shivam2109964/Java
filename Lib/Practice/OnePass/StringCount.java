package Lib.Practice.OnePass;

public class StringCount {
    public static void main(String[] args) {
        String input = "Hello123, I am 20 years old!";
        countVowelConsonantDigits(input);
    }

    public static void countVowelConsonantDigits(String str) {
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        str = str.toLowerCase();

        for (Character ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (isVowel(ch))
                    vowels++;
                else
                    consonants++;
            } else if (Character.isDigit(ch)) {
                digits++;
            }
        }
        System.out.println("Vowels " + vowels);
        System.out.println("Consonants " + consonants);
        System.out.println("Digits " + digits);
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
