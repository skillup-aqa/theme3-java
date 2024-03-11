package part2;

public class MaxOfThreeChecker {
    public static int maxOfThree(int number1, int number2, int number3) {
        int result;
        if (number1 < number2 && number3 < number2) {
            result = number2;
        } else if (number1 < number3) {
            result = number3;
        } else {
            result = number1;
        }

        return result;
    }

    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int result = maxOfThree(number1, number2, number3);
        System.out.println(result);
    }
}
