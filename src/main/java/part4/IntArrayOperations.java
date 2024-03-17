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

    public static int binarySearch(int[] array, int value, boolean ascending) {
        // TODO: Implement solution here
        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = fillWithNumbers(array1);
        System.out.println("Max value is: " + max(array2));
        System.out.println("Min value is: " + min(array2));
        System.out.println("Avg value is: " + avg(array2));

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


    }
}