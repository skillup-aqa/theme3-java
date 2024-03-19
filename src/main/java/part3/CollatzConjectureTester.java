package part3;

public class CollatzConjectureTester {
    public static int collatzConjecture(int n) {
        // Read about Collatz Conjecture here: https://en.wikipedia.org/wiki/Collatz_conjecture
        int cycle = 0;
        while (n > 0 && n != 1 ) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            cycle++; System.out.println(cycle + "cycles");
        }
        return cycle;
    }

    public static void main(String[] args) {
        int n = 6;
        int result = collatzConjecture(n);
        System.out.println(result);
    }
}
