package part2;

public class MaxOfThreeChecker {
    public static int maxOfThree(int number1, int number2, int number3) {
        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        return max;
    }

    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 9;
        int number3 = 4;
        int result = maxOfThree(number1, number2, number3);
        System.out.println(result);
    }
}
