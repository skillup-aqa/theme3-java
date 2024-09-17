package part2;

public class MaxOfThreeChecker {
    public static int maxOfThree(int number1, int number2, int number3) {

        int maxOfThree;

        if (number1 > number2 && number1 > number3){
            maxOfThree = number1;
        } else if (number2 > number1 && number2 > number3){
            maxOfThree = number2;

        }else {maxOfThree = number3;}
        return maxOfThree;
    }

    public static void main(String[] args) {
        int number1 = 179;
        int number2 = 7;
        int number3 = 3;
        int result = maxOfThree(number1, number2, number3);
        System.out.println(result);
    }
}
