package com.victor.datastructure;

import com.victor.datastructure.BaseSortingAlgorithm;
import org.junit.Test;

public class BaseSortingAlgorithmTest {
    int[] array = {4, 3, 5, 7, 1, 2, 6, 9, 8};

    @Test
    public void insertionSort() throws Exception {
        BaseSortingAlgorithm.insertionSort(array, 0, 9);
    }

    @Test
    public void bubbleSort() throws Exception {
        BaseSortingAlgorithm.bubbleSort(array, 0, 9);
    }

    @Test
    public void selectSort() throws Exception {
        BaseSortingAlgorithm.selectSort(array, 0, 9);
    }

    @Test
    public void shellSort() throws Exception {
        BaseSortingAlgorithm.shellSort(array, 0, 9);
    }

    @Test
    public void mergeSort() throws Exception {
        int[] result = BaseSortingAlgorithm.mergeSort(array, 0, 9);
        BaseSortingAlgorithm.print(result);
    }

    @Test
    public void quickSort() throws Exception {
        BaseSortingAlgorithm.quickSort(array, 0, 9);
        BaseSortingAlgorithm.print(array);
    }

    @Test
    public void heapSort() throws Exception {
        BaseSortingAlgorithm.heapSort(array, 0, 9);
        BaseSortingAlgorithm.print(array);
    }
}