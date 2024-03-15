package part3;

public class CollatzConjectureTester {
    public static int collatzConjecture(int n) {

        int i = 1;
        while (n > 1) {
            if ((n % 2) == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            i++;

        }
        return i;
    }

    public static void main(String[] args) {
        int n = 6;
        int result = collatzConjecture(n);
        System.out.println(result);
    }
}
