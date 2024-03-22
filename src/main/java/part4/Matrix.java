package part4;

public class Matrix {
    public static int[] reduceMatrixToArray(int[][] matrix) {
        int newArrayLength = 0;
        int newArrayPosition = 0;
        for (int i = 0; i < matrix.length; i++) {
            newArrayLength += matrix[i].length;
        }
        int[] result = new int[newArrayLength];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[newArrayPosition] = matrix[i][j];
                newArrayPosition++;
            }
        }

        return result;
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
        System.out.println();

        int[][] array01 = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9}};
        for (int j : reduceMatrixToArray(array01)) {
            System.out.println(j);
        }
    }

}
