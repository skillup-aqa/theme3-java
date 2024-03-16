package part2;

public class DartsGame {
    public static int getScore(double x, double y) {
        double radius = Math.sqrt(x * x + y * y);
       if (radius <= 1) {
           return 10;
       }else if (radius <= 5) {
           return 5;
       }else if (radius <= 10) {
           return 1;
       }else {
           return 0;
       }
}
    public static void main(String[] args) {
        double x = 15.0;
        double y = 15.0;
        int result = getScore(x, y);
        System.out.println(result);
    }
}
