package com.practice.array;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1775258235/
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int index = 1;
        int last = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > last) {
                last = nums[i];
                nums[index++] = last;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveDuplicates duplicates = new RemoveDuplicates();
        System.out.println(duplicates.removeDuplicates(new int[] { 1, 1, 2 }));
        System.out.println(duplicates.removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
    }
}
