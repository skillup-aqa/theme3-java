package part4;

import java.util.Arrays;
import java.util.Random;

public class IntArrayOperations {
    public static int[] fillWithNumbers(int[]array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1001);
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = new int[10];
        fillWithNumbers(array);
        System.out.println("Array with random numbers: " + Arrays.toString(array));

    }
    public static int max(int[] array) {
        return Arrays.stream(array).max().orElse(-1);
    }

    public static int min(int[] array) {
        return Arrays.stream(array).min().orElse(-1);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static double avg(int[] array) {
        return Arrays.stream(array).average().orElse(Double.NaN);
    }

    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static int[] copy(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }

    public static int[] removeDuplicates(int[] array) {
        return Arrays.stream(array).distinct().toArray();

    }

    public static int[] sort(int[] array, boolean ascending) {
        Arrays.sort(array);
        if (!ascending) {
            reverse(array);
        }
        return array;
    }

    public static boolean isSorted(int[] array, boolean ascending) {
        for (int i = 0; i < array.length - 1; i++) {
            if ((ascending && array[i] > array[i + 1]) || (!ascending && array[i] < array[i + 1])) {
                return false;
                            }
        }
        return true;
    }

    public static int[] merge(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        return mergedArray;
    }

    public static int binarySearch(int[] array, int value, boolean ascending) {
        if (!isSorted(array, ascending)) {
            return -1;
        }
        if (!ascending) {
            int[] tempArray = Arrays.copyOf(array, array.length);
            reverse(tempArray);
            return Arrays.binarySearch(tempArray, value);

        }
        return Arrays.binarySearch(array, value);
    }
}
