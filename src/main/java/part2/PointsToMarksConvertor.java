package part2;

public class PointsToMarksConvertor {
    public static char convertPointsToMarks(int points) {
        // Assume that points are always non-negative integers and less than 100
        // TODO: Implement solution here
        return 'X';
    }

    public static void main(String[] args) {
        int points = 90;
        char result = convertPointsToMarks(points);
        System.out.println(result);
    }
}
