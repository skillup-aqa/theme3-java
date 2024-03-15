package part2;

public class DartsGame {
    public static int getScore(double x, double y) {
        double distanceFromCenter = Math.sqrt(x * x + y * y);
        if (distanceFromCenter <= 1.0) {
            return 10;
        } else if (distanceFromCenter <= 5.0) {
            return 5;
        } else if (distanceFromCenter <= 10.0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        double x = 1.0;
        double y = 1.0;
        int result = getScore(x, y);
        System.out.println(result);
    }
}
