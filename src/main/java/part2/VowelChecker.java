package part2;

public class VowelChecker {
    public static boolean isVowel(char character) {
        // Consider, that character is a latin lowercase letter.
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        char character = 'a';
        boolean result = isVowel(character);
        System.out.println(result);
    }
}


