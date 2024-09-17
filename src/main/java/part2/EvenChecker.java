package part2;

public class EvenChecker {
    public static boolean isEven(int number) {
        // For sake of simplicity, we assume that 0 is an even number
        boolean isEven = number % 2 < 1;

        return isEven;

    }

    public static void main(String[] args) {
        int number = 200;
        boolean result = isEven(number);
        System.out.println(result);
    }
}
