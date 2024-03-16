package part2;

public class VowelChecker {
    public static boolean isVowel(char character) {
        // Consider, that character is a latin lowercase letter.
        return "aeiou".indexOf(character) != -1;
    }

    public static void main(String[] args) {
        char character = 'o';
        boolean result = isVowel(character);
        System.out.println(result);
    }
}
