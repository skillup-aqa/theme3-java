package part2;

public class EvenChecker {
    public static boolean Even(int number) {
        // For sake of simplicity, we assume that 0 is an even number
        if (number % 2 == 0)  {
        return true; } else {return false; }

    }

    public static void main(String[] args) {
        int number = 5;
        boolean result = Even(number);
        System.out.println(result);
    }
}
