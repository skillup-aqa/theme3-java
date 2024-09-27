package part2;

public class DartsGame {
    public static int getScore(double x, double y) {
        double distanceFromCenter = Math.sqrt(x * x + y * y);

        if (distanceFromCenter > 10) {
            return 0;
        } else if (distanceFromCenter <= 10 && distanceFromCenter > 5) {
            return 1;
        } else if (distanceFromCenter <= 5 && distanceFromCenter > 1) {
            return 5;
        } else {
            return 10;
        }
    }

    public static void main(String[] args) {
        double x = 1.0;
        double y = 1.0;
        int result = getScore(x, y);
        System.out.println(result);
    }
}