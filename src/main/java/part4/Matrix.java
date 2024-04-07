package part4;

import java.util.Arrays;

public class Matrix {
    public static int[] reduceMatrixToArray(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int totalElements = rows * cols;

        int[] flattenedArray = new int[totalElements];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flattenedArray[index++] = matrix[i][j];
            }
        }

        return flattenedArray;
    }

    public static int[][] fillMatrixBySpiral(int size) {
        int[][] spiralMatrix = new int[size][size];
        int value = 1;
        int left = 0, right = size - 1;
        int top = 0, bottom = size - 1;

        while (value <= size * size) {
            for (int i = left; i <= right; i++) {
                spiralMatrix[top][i] = value++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                spiralMatrix[i][right] = value++;
            }
            right--;

            if (value <= size * size) {
                for (int i = right; i >= left; i--) {
                    spiralMatrix[bottom][i] = value++;
                }
                bottom--;
            }

            if (value <= size * size) {

                for (int i = bottom; i >= top; i--) {
                    spiralMatrix[i][left] = value++;
                }
                left++;
            }
        }

        return spiralMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] flattenedArray = Matrix.reduceMatrixToArray(matrix);
        System.out.println("Flattened Array:");
        System.out.println(Arrays.toString(flattenedArray));

        int size = 4;
        int[][] spiralMatrix = Matrix.fillMatrixBySpiral(size);
        System.out.println("Spiral-filled Matrix:");
        for (int[] row : spiralMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}