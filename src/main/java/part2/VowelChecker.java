package part2;

public class VowelChecker {
    public static boolean isVowel(char character) {
        // Consider, that character is a latin lowercase letter.
        // TODO: Implement solution here
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }

    public static void main(String[] args) {
        char character = 'a';
        boolean result = isVowel(character);
        System.out.println(result);
    }
}
