package part4;

import java.util.Random;
import java.util.Arrays;

public class IntArrayOperations {
    public static void main(String[] args) {
        int[] array = new int[1001];
        array = fillWithNumbers(array);
        for (int num : array) {
            System.out.println(num + " ");}
            int MaxNumber = max(array);
        {
            System.out.println("Max number" + MaxNumber);

        }
int MinNumber = min(array);
        {
            System.out.println("Min number" + MinNumber);
        }
int SumArray = sum(array);
        System.out.println("Sum" + SumArray);
        System.out.println("Array before sorting:");
        printArray(array);

        Arrays.sort(array);

        System.out.println("Array after sorting:");
        printArray(array);
    }

    public static int[] fillWithNumbers(int[] array) {
        // TODO: Implement solution here
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1001);
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
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }


    public static int[] copy(int[] array) {
        int[] copiedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }

    public static int indexOf(int[] array, int value) {
        // TODO: Implement solution here
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int[] removeDuplicates(int[] array) {
        // TODO: Implement solution here
        Arrays.sort(array);
        int currentIndex = 0;
        int nextDistinctIndex = 1;
        while (nextDistinctIndex < array.length) {
            if (array[currentIndex] != array[nextDistinctIndex]) {
                array[++currentIndex] = array[nextDistinctIndex];
            }
            nextDistinctIndex++;
        }
        return Arrays.copyOf(array, currentIndex + 1);
    }

    public static int[] sort(int[] array, boolean ascending) {
        // TODO: Implement solution here
//        return null;
        Arrays.sort(array);
        return array;
    }

    public static void printArray(int[] array) {

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static boolean isSorted(int[] array, boolean ascending) {
        // TODO: Implement solution here
        if (array.length <= 1) {
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
        // TODO: Implement solution here
        int n1 = array1.length;
        int n2 = array2.length;
        int[] mergedArray = new int[n1 + n2]; // Resulting array

        int i = 0, j = 0, k = 0;
                while (i < n1 && j < n2) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }
        while (i < n1) {
            mergedArray[k++] = array1[i++];
        }
        while (j < n2) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }


    public static int binarySearch(int[] array, int value, boolean ascending) {
        // TODO: Implement solution here
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == value) {
                return mid;
            } else if (ascending) {
                if (array[mid] < value) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {

                if (array[mid] > value) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}

