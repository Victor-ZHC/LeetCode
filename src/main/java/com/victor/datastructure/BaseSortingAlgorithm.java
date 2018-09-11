package com.victor.datastructure;

public class BaseSortingAlgorithm {
    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("]");
    }

    public static void insertionSort(int[] array, int begin, int end) {
        for (int i = begin + 1; i < end; i++) {
            int tmp = array[i];
            int j = i - 1;
            while (j > begin - 1 && array[j] > tmp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
        }
        print(array);
    }

    public static void bubbleSort(int[] array, int begin, int end) {
        for (int i = begin; i < end; i++) {
            for (int j = begin + 1; j < end - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        print(array);
    }

    public static void selectSort(int[] array, int begin, int end) {
        for (int i = begin; i < end; i++) {
            int minIndex = i;
            for (int j = i + 1; j < end; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        print(array);
    }

    public static void shellSort(int[] array, int begin, int end) {
        int gap = (end - begin) / 2;
        while (gap > 0) {
            for (int i = 0; i < gap; i++) {
                for (int j = i; j < end; j += gap) {
                    int tmp = array[j];
                    int k = j - gap;
                    while (k > begin - 1 && array[k] > tmp) {
                        array[k + gap] = array[k];
                        k -= gap;
                    }
                    array[k + gap] = tmp;
                }
            }
            gap = gap / 2;
        }
        print(array);
    }

    public static int[] mergeSort (int[] array, int begin, int end) {
        if (end - begin <= 1) {
            return new int[]{array[begin]};
        }
        int mid = (begin + end) / 2;
        int[] left = mergeSort(array, begin, mid);
        int[] right = mergeSort(array, mid, end);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < result.length; i++) {
            if (j == left.length) {
                result[i] = right[k];
                k++;
            } else if (k == right.length) {
                result[i] = left[j];
                j++;
            } else if (left[j] < right[k]) {
                result[i] = left[j];
                j++;
            } else {
                result[i] = right[k];
                k++;
            }
        }
        return result;
    }

    public static void quickSort (int[] array, int left, int right) {
        if (left >= right - 1) {
            return;
        }
        int i = left;
        int j = right - 1;

        int tmp;
        while (i < j) {
            while (array[i] < array[j]) {
                j--;
            }
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;

            while (array[j] > array[i]) {
                i++;
            }
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        quickSort(array, left, i);
        quickSort(array, i + 1, right);
    }

    public static void heapSort (int[] array, int begin, int end) {
        int start = (end + begin - 1) / 2;
        for (int i = start; i >= begin; i--) {
            justifyHeap(array, i, end);
        }
        for (int i = end - 1; i >= begin; i--) {
            int tmp = array[i];
            array[i] = array[begin];
            array[begin] = tmp;
            justifyHeap(array, begin, i);
        }
    }

    private static void justifyHeap (int[] array, int begin, int end) {
        int root = begin;
        while (true) {
            int child = root * 2 + 1;
            if (child >= end) {
                return;
            }
            if (child < end - 1 && array[child] > array[child + 1]) {
                child = child + 1;
            }
            if (array[root] < array[child]) {
                int tmp = array[root];
                array[root] = array[child];
                array[child] = tmp;
            }
            root = child;
        }
    }
}
