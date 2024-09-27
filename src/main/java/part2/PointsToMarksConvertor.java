package part2;

public class PointsToMarksConvertor {
    public static char convertPointsToMarks(int points) {
        // Assume that points are always non-negative integers and less than 100
        if (points < 60) {
            return 'F';
        }
        if (points < 75) {
            return 'D';
        }
        if (points < 85) {
            return 'C';
        }
        if (points < 90) {
            return 'B';
        }
        return 'A';
    }

    public static void main(String[] args) {
        int points = 90;
        char result = convertPointsToMarks(points);
        System.out.println(result);
    }
}
