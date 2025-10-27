package com.practice.array.hard;

public class CountArrayInversions {

    public int merge(int nums[], int start, int mid, int end) {

        int i = start;
        int j = mid + 1;

        // check if already sorted.
        if (nums[mid] < nums[mid + 1]) {
            return 0;
        }

        int count = 0;

        // merge the elements.
        while ((i <= mid) && (j <= end)) {

            // if already sorted.
            if (nums[i] <= nums[j]) {
                i++;
                continue;
            }

            // smaller value
            // that needs to be inserted
            // at beginning.
            int val = nums[j];
            int idx = j;
            while (idx > i) {
                nums[idx] = nums[idx - 1];
                count++;
                idx--;
            }
            nums[idx] = val;

            i++;
            mid++;
            j++;
        }

        return count;
    }

    public int mergeSort(int nums[], int start, int end) {

        if (start >= end) {
            return 0;
        }

        int mid = start + (end - start) / 2;

        int count = 0;

        count += mergeSort(nums, start, mid);
        count += mergeSort(nums, mid + 1, end);

        count += merge(nums, start, mid, end);

        return count;
    }

    public int numberOfInversions(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {

        CountArrayInversions arrayInversion = new CountArrayInversions();
        System.out.println(arrayInversion.numberOfInversions(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(arrayInversion.numberOfInversions(new int[] { 5, 4, 3, 2, 1 }));
        System.out.println(arrayInversion.numberOfInversions(new int[] { 5, 3, 2, 1, 4 }));
    }
}
