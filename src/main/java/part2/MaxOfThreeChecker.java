package part2;

public class MaxOfThreeChecker {
    public static int maxOfThree(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number3 && number2 > number1) {
            return number2;
        } else {
            return number3;
        }
    }

    public static void main(String[] args) {
        int number1 = 105;
        int number2 = 78;
        int number3 = 20;
        int result = maxOfThree(number1, number2, number3);
        System.out.println(result);
    }
}
