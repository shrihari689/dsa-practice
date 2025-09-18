package com.practice.array;

/**
 * https://takeuforward.org/plus/dsa/problems/check-if-the-array-is-sorted-ii
 */
public class CheckIfSorted {

    public boolean check(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return true;
        }

        int count = 0;

        for (int i = 1; i < n; ++i) {
            if (nums[i] < nums[i - 1]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }

        if (nums[0] < nums[n - 1]) {
            count++;
        }

        return count <= 1;
    }

    public static void main(String[] args) {
        CheckIfSorted checkIfSorted = new CheckIfSorted();
        System.out.println(checkIfSorted.check(new int[] { 3, 4, 5, 1, 2 }));
        System.out.println(checkIfSorted.check(new int[] { 2, 1, 3, 4 }));
        System.out.println(checkIfSorted.check(new int[] { 2, 1 }));
        System.out.println(checkIfSorted.check(new int[] { 1, 2, 3 }));
        System.out.println(checkIfSorted.check(new int[] { 1, 1, 1 }));
        System.out.println(checkIfSorted.check(new int[] { 6, 10, 6 }));
    }
}
