package part3;

public class CollatzConjectureTester {
    public static int collatzConjecture(int n) {

        int steps = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = collatzConjecture(n);
        System.out.println(result);
    }
}
