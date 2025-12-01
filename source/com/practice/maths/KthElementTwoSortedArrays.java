package com.practice.maths;

import java.util.ArrayList;
import java.util.List;

public class KthElementTwoSortedArrays {

    public static int kthElement(ArrayList<Integer> a, ArrayList<Integer> b, int m, int n, int k) {

        if (m < n) {
            return kthElement(b, a, n, m, k);
        }

        int start = k >= n ? k - n : 0;
        int end = Math.min(k, m);
        while (start <= end) {

            int partitionX = (end + start) / 2;
            int partitionY = k - partitionX;

            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : a.get(partitionX - 1);
            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : a.get(partitionX);

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : b.get(partitionY - 1);
            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : b.get(partitionY);

            if ((maxLeftX <= minRightY) && (maxLeftY <= minRightX)) {
                return Math.max(maxLeftX, maxLeftY);
            } else if (maxLeftX > minRightY) {
                end = partitionX - 1;
            } else {
                start = partitionX + 1;
            }
        }

        return 0;
    }

    private static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        return kthElement(arr1, arr2, arr1.size(), arr2.size(), k);
    }

    public static void main(String[] args) {
        System.out.println(
                KthElementTwoSortedArrays.kthElement(new ArrayList<>(List.of(2, 3, 45)),
                        new ArrayList<>(List.of(4, 6, 7, 8)), 3));
    }
}
