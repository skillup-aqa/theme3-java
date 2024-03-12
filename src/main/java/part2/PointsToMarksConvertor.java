package part2;

public class PointsToMarksConvertor {
    public static char convertPointsToMarks(int points) {
        // Assume that points are always non-negative integers and less than 100
        char mark;

        if (points < 60) mark = 'F';
        else if (points <= 74) mark = 'D';
        else if (points <= 84) mark = 'C';
        else if (points <= 89) mark = 'B';
        else mark = 'A';

        return mark;
    }

    public static void main(String[] args) {
        int points = 90;
        char result = convertPointsToMarks(points);
        System.out.println(result);
    }
}
