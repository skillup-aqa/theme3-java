package part4;

import java.util.Random;

public class IntArrayOperations {
    public static void main(String[] args) {
        int[] array = new int[1001];
        System.out.println("sum" + sum(array));
        System.out.println("Max number" + max(array));
        System.out.println("Min number" + min(array));


    }
    public static int[] fillWithNumbers(int[] array) {
        // TODO: Implement solution here
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(1001);
                                }
        return array;

    }
    public static int max(int[] array) {
        // TODO: Implement solution here
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                            }
        }
        return max;
    }

    public static int min(int[] array) {
        // TODO: Implement solution here
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
        }
        return min;
    }


    public static int sum(int[] array) {
        // TODO: Implement solution here
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int avg(int[] array) {
        int sum = sum(array);
        int average = sum / array.length;
        return average;
    }


    public static int[] reverse(int[] array) {
        // TODO: Implement solution here
        return null;
    }

    public static int[] copy(int[] array) {
        // TODO: Implement solution here
        return null;
    }

    public static int indexOf(int[] array, int value) {
        // TODO: Implement solution here
        return -1;
    }

    public static int[] removeDuplicates(int[] array) {
        // TODO: Implement solution here
        return null;
    }

    public static int[] sort(int[] array, boolean ascending) {
        // TODO: Implement solution here
        return null;
    }

    public static boolean isSorted(int[] array, boolean ascending) {
        // TODO: Implement solution here
        return false;
    }

    public static int[] merge(int[] array1, int[] array2) {
        // TODO: Implement solution here
        return null;
    }

    public static int binarySearch (int[] array, int value, boolean ascending) {
        // TODO: Implement solution here
        return -1;
    }
}

