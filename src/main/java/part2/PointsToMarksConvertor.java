package part2;

public class PointsToMarksConvertor {
    public static char convertPointsToMarks(int points) {
        // Assume that points are always non-negative integers and less than 100
        // TODO: Implement solution here
        if (points <= 100 && points >= 90) {return 'A'; }
        else if (points <= 89 && points >= 85) {return 'B'; }
        else if (points <= 84 && points >= 75) { return 'C'; }
        else if (points <= 74 && points >= 60) { return 'D'; }
        else return 'F';

    }

    public static void main(String[] args) {
        int points = 90;
        char result = convertPointsToMarks(points);
        System.out.println(result);
    }
}
