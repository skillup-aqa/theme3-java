package part2;

public class PointsToMarksConvertor {
    public static char convertPointsToMarks(int points) {
        // Assume that points are always non-negative integers and less than 100
        char result;

        if (points >= 90 && points <= 100) {
            result = 'A';
        } else if (points >= 85 && points <= 89) {
            result = 'B';
        } else if (points >= 75 && points <= 84) {
            result = 'C';
        } else if (points >= 60 && points <= 74) {
            result = 'D';
        } else if (points >= 0 && points <= 59) {
            result = 'F';
        } else {
            result = 'O';  //Default in case of invalid points
        }


        return result;
    }

    public static void main(String[] args) {
        int points = 85;
        char result = convertPointsToMarks(points);
        System.out.println(result);
    }
}
