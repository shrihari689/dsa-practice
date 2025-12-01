package com.practice.maths;

public class MedianTwoSortedArrays {
    public double findMedianSortedArrays(int[] a, int[] b) {

        if (a.length < b.length) {
            return _findMedianSortedArrays(a, b);
        }

        return _findMedianSortedArrays(b, a);
    }

    private double _findMedianSortedArrays(int a[], int b[]) {

        int m = a.length;
        int n = b.length;

        int total = m + n;

        int start = 0;
        int end = m;
        while (start <= end) {

            int partitionX = (end + start) / 2;
            int partitionY = ((total + 1) / 2) - partitionX;

            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : a[partitionX - 1];
            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : a[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : b[partitionY - 1];
            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : b[partitionY];

            if ((maxLeftX <= minRightY) && (maxLeftY <= minRightX)) {

                if ((total % 2) == 0) {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightY, minRightX)) / 2.0;
                } else {
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                end = partitionX - 1;
            } else {
                start = partitionX + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        MedianTwoSortedArrays arrays = new MedianTwoSortedArrays();
        System.out.println(arrays.findMedianSortedArrays(new int[] {}, new int[] { 2 }));
        System.out.println(arrays.findMedianSortedArrays(new int[] { 3 }, new int[] { 1, 2, 4 }));
        System.out.println(arrays.findMedianSortedArrays(new int[] {}, new int[] { 2, 3 }));
        System.out.println(arrays.findMedianSortedArrays(new int[] { -10, -9, -8 }, new int[] { 1, 2 }));
        System.out.println(arrays.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 }));
        System.out.println(arrays.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 }));
    }
}
