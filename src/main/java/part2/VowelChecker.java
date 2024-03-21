package part2;

public class VowelChecker {
    public static boolean isVowel(char character) {
        // Consider, that character is a latin lowercase letter.
        // TODO: Implement solution here
        switch (character) {
            case 'a':
            case 'e':
            case 'y':
            case 'u':
            case 'i':
            case 'o':
                return true;
            default:
                return false;

        }
    }

    public static void main(String[] args) {
        char character = 'a';
        boolean result = isVowel(character);
        System.out.println(result);
    }
}
