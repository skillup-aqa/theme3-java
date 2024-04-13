package part2;

public class VowelChecker {
    public static boolean isVowel(char character) {
        // Consider, that character is a latin lowercase letter.

        if (character == 'a' || character == 'u' || character == 'e' || character == 'i' || character == 'y') {
            return true;}
        else return false;





    }

    public static void main(String[] args) {
        char character = 'y';
        boolean result = isVowel(character);
        System.out.println(result);
    }
}
