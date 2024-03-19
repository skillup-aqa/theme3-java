package part4;

public class IntArrayOperations {
    public static int[] fillWithNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
            System.out.println("Array index is:" + i);
            System.out.println(array[i]);
        }

        return array;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }


    public static int sum(int[] array) {
        // TODO: Implement solution here
        return -1;
    }

    public static int avg(int[] array) {
        int numberAvg = 0;
        for (int j : array) {
            numberAvg += j;
        }
        return numberAvg / array.length;
    }

    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0, j = (array.length - 1); i < array.length; i++, j--) {
            reversedArray[j] = array[i];
        }
        return reversedArray;
    }

    public static int[] copy(int[] array) {
        int[] copiedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }

    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int[] removeDuplicates(int[] array) {
        int[] withNoDuplicates = new int[array.length];
        int i = 0;
        for (int j : array) {
            if (indexOf(withNoDuplicates, j) == -1) {
                withNoDuplicates[i] = j;
                i++;
            }

        }
        int[] result = new int[i];
        for (int q = 0; q < i; q++) {
            result[q] = withNoDuplicates[q];
        }

        return result;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] sort(int[] array, boolean ascending) {
        int[] sorted = copy(array);
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (ascending) {
                    if (sorted[i] > sorted[j]) {
                        swap(sorted, i, j);
                    }
                } else {
                    if (sorted[i] < sorted[j]) {
                        swap(sorted, i, j);
                    }
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

    public static int[] merge(int[] array1, int[] array2) {
        int lengthOfMergedArray = array1.length + array2.length;
        int[] mergedArray = new int[lengthOfMergedArray];
        int n = 0;
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        for (int k = array1.length; k < lengthOfMergedArray; k++) {
            mergedArray[k] = array2[n];
            n++;
        }
        return mergedArray;
    }

    public static int binarySearch(int[] array, int value, boolean ascending) {
        // TODO: Implement solution here
        return -1;
    }

    public static void main(String[] args) {
        int[] emptyArray = {};
        int[] array1 = new int[5];
        int[] array2 = fillWithNumbers(array1);
        System.out.println("Max value is: " + max(array2));
        System.out.println("Min value is: " + min(array2));
        System.out.println("Avg value is: " + avg(array2));
        // System.out.println("Avg for empty: " + avg(emptyArray));

        System.out.println("Reversed array is: ");
        int[] revArray = reverse(array2);
        for (int j : revArray) {
            System.out.println(j);
        }

        System.out.println("Copied array is: ");
        for (int i : copy(revArray)) {
            System.out.println(i);
        }

        System.out.println("Checking if value is present: ");
        int[] arrayToCheckIfValueIsPresent = {1, 3, 5, 7, 15, 20, 7, 12, 3};
        System.out.println(indexOf(arrayToCheckIfValueIsPresent, 5));
        System.out.println(indexOf(arrayToCheckIfValueIsPresent, 6));

        System.out.println("Removed duplicates: ");
        for (int i : removeDuplicates(arrayToCheckIfValueIsPresent)) {
            System.out.println(i);
        }

        System.out.println("Merged array : ");
        for (int j : merge(array2, arrayToCheckIfValueIsPresent)) {
            System.out.println(j);
        }

        System.out.println("Sorted array ascending : ");
        for (int j : sort(arrayToCheckIfValueIsPresent, true)) {
            System.out.println(j);
        }
        System.out.println("Is sorted descending: " + isSorted(sort(arrayToCheckIfValueIsPresent, true), false));
        System.out.println("Is sorted descending: " + isSorted(sort(arrayToCheckIfValueIsPresent, true), true));

        System.out.println("Sorted array descending : ");
        for (int j : sort(arrayToCheckIfValueIsPresent, false)) {
            System.out.println(j);
        }
        System.out.println("Is sorted descending: " + isSorted(sort(arrayToCheckIfValueIsPresent, false), false));
        System.out.println("Is sorted ascending: " + isSorted(sort(arrayToCheckIfValueIsPresent, false), true));


    }
}