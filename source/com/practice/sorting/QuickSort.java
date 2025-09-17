package com.practice.sorting;

import java.util.Arrays;

public class QuickSort {

    public void sort(int arr[], int start, int end) {

        if (start >= end) {
            return;
        }

        // Partition
        int boundary = partition(arr, start, end);

        // Sort left
        sort(arr, start, boundary);

        // Sort right
        sort(arr, boundary + 1, end);
    }

    private int partition(int arr[], int start, int end) {
        int pivot = arr[end]; // last item
        int left = start - 1;
        for (int i = start; i <= end; ++i) {
            if (arr[i] <= pivot) {
                swap(arr, i, ++left);
            }
        }
        return left;
    }

    private void swap(int arr[], int from, int to) {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int arr[] = new int[] { 20, 2, 7, 12, 15, 1, 6, 8 };
        quickSort.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
