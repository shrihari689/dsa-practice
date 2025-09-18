package com.practice.sorting;

import java.util.Arrays;

public class MergeSortInPlace {

    public void mergeSort(int arr[], int start, int end) {

        // one element.
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    public void merge(int arr[], int start, int mid, int end) {

        int i = start;
        int j = mid + 1;

        if (arr[mid] <= arr[j]) {
            return;
        }

        while ((i <= mid) && (j <= end)) {

            // Check if smaller and
            // shift all elements.
            if (arr[i] <= arr[j]) {
                i++;
                continue;
            }

            int value = arr[j];
            int idx = j;

            while (idx > i) {
                arr[idx] = arr[idx - 1];
                idx--;
            }

            arr[i] = value;

            i += 1;
            mid += 1;
            j += 1;
        }

    }

    public static void main(String[] args) {
        MergeSortInPlace inPlace = new MergeSortInPlace();
        int arr[] = new int[] { 12, 11, 13, 5, 6, 7 };
        inPlace.mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
