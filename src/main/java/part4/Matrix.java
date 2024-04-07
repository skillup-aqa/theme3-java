package part4;

public class Matrix {
    public static int[] reduceMatrixToArray(int[][] matrix) {
        int allElements = 0;
        for (int[] row : matrix) {
            allElements += row.length;
        }
        int[] result = new int[allElements];
        int index = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                result[index++] = num;
            }
        }
        return result;
    }

    public static int[][] fillMatrixBySpiral(int size) {
        int[][] matrixFillNaturalNumbers = new int[size][size];
        int naturalNumbers = 1;
        int left = 0;
        int right = size - 1;
        int top = 0;
        int bottom = size - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                matrixFillNaturalNumbers[top][i] = naturalNumbers++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrixFillNaturalNumbers[i][right] = naturalNumbers++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                matrixFillNaturalNumbers[bottom][i] = naturalNumbers++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                matrixFillNaturalNumbers[i][left] = naturalNumbers++;
            }
            left++;
        }
        return matrixFillNaturalNumbers;
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 10, 15, 20},
                {55, 12, 0, 3}
        };
        int[] result = Matrix.reduceMatrixToArray(matrix);
        System.out.println("Result:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        String row = "";
        int[][] matrix1 = fillMatrixBySpiral(7);
        for (int i = 0; i < matrix.length; i++) {
            row = "";
            for (int j = 0; j < matrix.length; j++) {
                row += matrix1[i][j] + " ";
            }
        }
        System.out.println(row);

        System.out.println("Position");
        System.out.println(matrix[1][3]);
    }
}

