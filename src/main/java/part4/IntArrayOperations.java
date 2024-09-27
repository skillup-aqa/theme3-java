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
        if (array.length == 0) {
            return 0;
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }


    public static int sum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
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
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length - 1 - i] = array[i];
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
        int newArrayLength = 0;
        for (int currentArrayValue : array) {
            if (indexOf(withNoDuplicates, currentArrayValue) == -1) {
                withNoDuplicates[newArrayLength] = currentArrayValue;
                newArrayLength++;
            }

        }
        int[] result = new int[newArrayLength];
        for (int i = 0; i < newArrayLength; i++) {
            result[i] = withNoDuplicates[i];
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
        int array1Length = array1.length;
        for (int i = 0; i < array1Length; i++) {
            mergedArray[i] = array1[i];
        }

        for (int n = 0; n < array2.length; n++) {
            mergedArray[array1Length + n] = array2[n];
        }
        return mergedArray;
    }


    public static int binarySearch(int[] array, int value, boolean ascending) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        if (!isSorted(array, ascending)) return -1;
        while (low <= high) {
            mid = (low + high) / 2;
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
        int[] emptyArray = {};
        int[] array1 = new int[5];
        int[] array2 = fillWithNumbers(array1);
        System.out.println("Max value is: " + max(array2));
        System.out.println("Min value is: " + min(array2));
        System.out.println("Avg value is: " + avg(array2));
        // System.out.println("Avg for empty: " + avg(emptyArray));

        System.out.println("Reversed array is: ");
        int[] revArray = reverse(array2);
        for (int currentArrayElement : revArray) {
            System.out.println(currentArrayElement);
        }

        System.out.println("Copied array is: ");
        for (int currentArrayElement : copy(revArray)) {
            System.out.println(currentArrayElement);
        }

        System.out.println("Checking if value is present: ");
        int[] arrayToCheckIfValueIsPresent = {1, 3, 5, 7, 15, 20, 7, 12, 3};
        System.out.println(indexOf(arrayToCheckIfValueIsPresent, 5));
        System.out.println(indexOf(arrayToCheckIfValueIsPresent, 6));

        System.out.println("Removed duplicates: ");
        for (int currentArrayElement : removeDuplicates(arrayToCheckIfValueIsPresent)) {
            System.out.println(currentArrayElement);
        }

        System.out.println("Merged array : ");
        for (int currentArrayElement : merge(array2, arrayToCheckIfValueIsPresent)) {
            System.out.println(currentArrayElement);
        }

        System.out.println("Sorted array ascending : ");
        for (int j : sort(arrayToCheckIfValueIsPresent, true)) {
            System.out.println(j);
        }
        System.out.println("Is sorted descending: " + isSorted(sort(arrayToCheckIfValueIsPresent, true), false));
        System.out.println("Is sorted descending: " + isSorted(sort(arrayToCheckIfValueIsPresent, true), true));

        System.out.println("Sorted array descending : ");
        for (int currentArrayElement : sort(arrayToCheckIfValueIsPresent, false)) {
            System.out.println(currentArrayElement);
        }
        System.out.println("Is sorted descending: " + isSorted(sort(arrayToCheckIfValueIsPresent, false), false));
        System.out.println("Is sorted ascending: " + isSorted(sort(arrayToCheckIfValueIsPresent, false), true));

        System.out.println("Sum of values is: " + sum(arrayToCheckIfValueIsPresent));


        System.out.println("Binary search asc: " + binarySearch(sort(arrayToCheckIfValueIsPresent, true), 5, true));
        System.out.println("Binary search desc: " + binarySearch(sort(arrayToCheckIfValueIsPresent, false), 5, false));
        System.out.println("Binary search asc with absent value: " + binarySearch(sort(arrayToCheckIfValueIsPresent, true), 8, true));
        System.out.println("Binary search asc with not sorted massive: " + binarySearch(arrayToCheckIfValueIsPresent, 5, true));

        //from test
        int[] arrayBin = {1, 2, 3, 4, 5};
        System.out.println(binarySearch(arrayBin, 2, true));
    }

}