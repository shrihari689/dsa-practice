package com.practice.recursion;

import java.util.Arrays;

public class ReverseArray {
    public void reverse(int[] arr, int n) {
        int len = arr.length;
        int sourceIdx = n - 1;
        int destIdx = len - n;
        if (destIdx >= sourceIdx) {
            return;
        }
        swap(arr, sourceIdx, destIdx);
        reverse(arr, n - 1);
    }

    private void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        ReverseArray array = new ReverseArray();
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        array.reverse(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
