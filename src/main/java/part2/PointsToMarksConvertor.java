package part2;

import java.util.Scanner;

public class PointsToMarksConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student's points (0-100): ");
        int mark = scanner.nextInt();

        char letterMark = getLetterMark(mark);
        System.out.println("Student's letter mark: " + letterMark);

        scanner.close();
    }

    public static char getLetterMark(int mark) {
        if (mark >= 90 && mark <= 100) {
            return 'A';
        } else if (mark >= 85 && mark <= 89) {
            return 'B';
        } else if (mark >= 75 && mark <= 84) {
            return 'C';
        } else if (mark >= 60 && mark <= 74) {
            return 'D';
        } else {
            return 'F';
        }
    }
}



