package part2;

public class EvenChecker {
    public static boolean isEven(int number) {
        // For sake of simplicity, we assume that 0 is an even number
        boolean result = false;

        if (number % 2 == 0) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 1;
        boolean result = isEven(number);
        System.out.println(result);
    }
}
