package part2;

public class VowelChecker {
    public static boolean isVowel(char character) {
        // Consider, that character is a latin lowercase letter.
        if (character == 'a') {
            return character == 'a';
          }
        if (character == 'e') { return character == 'e'; }
        if (character == 'i') {
            return character == 'i';
        }
        if (character == 'o') {
            return character == 'o';
        }
        if (character == 'u') {
            return character == 'u';
        } else return false;


    }

    public static void main(String[] args) {
        char character = 'u';
        boolean result = isVowel(character);
        System.out.println(result);
    }
}
