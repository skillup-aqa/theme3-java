package part4;

public class Matrix {
    public static int[] reduceMatrixToArray(int[][] matrix) {
        int size = 0;

        for (int[] arrays : matrix) {
            size += arrays.length;
        }

        int[] result = new int[size];
        int index = 0;
        for (int[] array : matrix) {
            for (int anInt : array) {
                result[index++] = anInt;
            }
        }

        return result;
    }

    public static int[][] fillMatrixBySpiral(int size) {
        int[][] result = new int[size][size];
        int value = 1;
        int left = 0;
        int right = size - 1;
        int top = 0;
        int bottom = size - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                result[top][i] = value++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result[i][right] = value++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                result[bottom][i] = value++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                result[i][left] = value++;
            }
            left++;
        }

        return result;
    }
}
