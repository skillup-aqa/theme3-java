package part4;

import java.util.Arrays;
import java.util.Random;

public class IntArrayOperations {

    public static int[] fillWithNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        System.out.println("An array of random numbers from 0 to 1000:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println('\n');
        return array;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int k : array) {
            if (k < min) {
                min = k;
            }
        }
        return min;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static int avg(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        return sum(array) / array.length;
    }

    public static int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static int[] copy(int[] array) {
        int[] copied = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copied[i] = array[i];
        }
        return copied;
    }

    public static int indexOf(int[] array, int value) {
        int[] index = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int[] removeDuplicates(int[] array) {
        int[] primary = new int[array.length];
        int index = 0;
        for (int k : array) {
            if (indexOf(primary, k) == -1) {
                primary[index++] = k;
            }
        }
        int[] newArrey = new int[index];
        for (int i = 0; i < index; i++) {
            newArrey[i] = primary[i];
        }
        return newArrey;
    }

    public static void swap(int[] array, int i, int k) {
        int temp = array[i];
        array[i] = array[k];
        array[k] = temp;
    }

    public static int[] sort(int[] array, boolean ascending) {
        int[] sorted = copy(array);
        for (int i = 0; i < sorted.length; i++) {
            for (int k = i + 1; k < sorted.length; k++) {
                if (ascending) {
                    if (sorted[i] > sorted[k]) {
                        swap(sorted, i, k);
                    }
                } else {
                    if (sorted[i] < sorted[k]) {
                        swap(sorted, i, k);
                    }
                    System.out.println(k);
                }
            }
        }
        return sorted;
    }

    public static boolean isSorted(int[] array, boolean ascending) {
        if (array.length < 2) {
            return true;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (ascending) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
            } else {
                if (array[i] < array[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] merge(int[] array2, int[] array3) {
        int[] mergedArrays = new int[array2.length + array3.length];
        for (int i = 0; i < array2.length; i++) {
            mergedArrays[i] = array2[i];
        }
        for (int i = 0; i < array3.length; i++) {
            mergedArrays[array2.length + i] = array3[i];
        }
        return mergedArrays;
    }

    public static int binarySearch(int[] array, int value, boolean ascending) {
        int low = 0;
        int high = array.length - 1;
        if (!isSorted(array, ascending)) {
            System.out.println("Array not sorted");
            return -1;
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == value) {
                return mid;
            } else {
                if (ascending) {
                    if (array[mid] < value) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                } else {
                    if (array[mid] < value) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = new int[7];
        int[] array2 = fillWithNumbers(array1);
        int[] array3 = {12, 3, 5, 8, 13, 25, 50};

        System.out.println("Max value is: " + max(array2));
        System.out.println("Min value is: " + min(array2));
        System.out.println("Sum is: " + sum(array2));
        System.out.println("Avg value is: " + avg(array2));
        System.out.println("Reverse array of random numbers: " + Arrays.toString(reverse(array1)));
        System.out.println("Array copy: " + Arrays.toString(copy(array1)));
        System.out.println("Checking for the presence of an element in the array: " + indexOf(array2, -102));
        System.out.println("Array after deleting the copy: " + Arrays.toString(removeDuplicates(array2)));

        System.out.println("Sorted array ascending : ");
        for (int k : sort(array2, true)) {
            System.out.println(k);
        }
        System.out.println("Is sorted descending: " + isSorted(sort(array2, true), false));
        System.out.println("Is sorted descending: " + isSorted(sort(array2, true), true));

        System.out.println("Sorted array descending : ");
        for (int k : sort(array2, false)) {
            System.out.println(k);
        }
        System.out.println("Is sorted descending: " + isSorted(sort(array2, false), false));
        System.out.println("Is sorted ascending: " + isSorted(sort(array2, false), true));

        System.out.println("Merged Arrays : ");
        for (int k : merge(array2, array3)) {
            System.out.println(k);
        }

        System.out.println("Binary search in an unsorted array: " + binarySearch(array2, 50, true));

    }

}


