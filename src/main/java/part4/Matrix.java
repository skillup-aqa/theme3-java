package part4;

public class Matrix {
    public static int[] reduceMatrixToArray(int[][] matrix) {
        // TODO: Implement solution here
        return null;
    }

    public static int[][] fillMatrixBySpiral(int size) {
        int[][] matrixNatural = new int[size][size];
        int natural = 1;
        int top = 0, bottom = size - 1, left = 0, right = size - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                matrixNatural[top][i] = natural;
                natural++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrixNatural[i][right] = natural;
                natural++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                matrixNatural[bottom][i] = natural;
                natural++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                matrixNatural[i][left] = natural;
                natural++;
            }
            left++;
        }


        return matrixNatural;
    }

    public static void main(String[] args) {
        String row = "";
        int[][] matrix = fillMatrixBySpiral(5);
        for (int i = 0; i < matrix.length; i++) {
            row = "";
            for (int j = 0; j < matrix.length; j++) {
                row += matrix[i][j] + " ";
            }
            System.out.println(row);

        }
        System.out.println("value position");
        System.out.println(matrix[1][3]);
    }
}
