package com.practice.array;

/**
 * https://takeuforward.org/plus/dsa/problems/linear-search
 */
public class LinearSearch {
    public int linearSearch(int nums[], int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch search = new LinearSearch();
        System.out.println(search.linearSearch(new int[] { 2, 3, 4, 5, 3 }, 3));
        System.out.println(search.linearSearch(new int[] { 2, -4, 4, 0, 10 }, 6));
    }
}
