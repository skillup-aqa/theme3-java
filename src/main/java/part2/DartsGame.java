package part2;

public class DartsGame {
    public static int getScore(double x, double y) {
        double radius = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        int points;
        if (radius <= 1) {
            points = 10;
        } else if (radius <= 5) {
            points = 5;
        } else if (radius <= 10) {
            points = 1;
        } else {
            points = 0;
        }
        return points;
    }

    public static void main(String[] args) {
        double x = 1.0;
        double y = 1.0;
        int result = getScore(x, y);
        System.out.println(result);
    }
}
