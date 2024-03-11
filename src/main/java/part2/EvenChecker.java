package part2;

public class EvenChecker {
    public static boolean isEven(int number) {
        return (number % 2) == 0;
    }

    public static void main(String[] args) {
        int number = 1;
        boolean result = isEven(number);
        System.out.println(result);
    }
}
