package com.practice.search.oned;

public class SingleElementSortedArray {

    public int singleNonDuplicate(int[] nums) {

        int n = nums.length;

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int previous = Math.max(start, mid - 1);
            int next = Math.min(mid + 1, end);

            // odd index: = previous element
            if ((mid % 2) != 0) {

                if ((nums[mid] != nums[previous]) && (nums[mid] == nums[next])) {
                    end = previous;
                } else if ((nums[mid] == nums[previous]) && (nums[mid] != nums[next])) {
                    start = next;
                } else {
                    return nums[mid];
                }

            } else {

                if ((nums[mid] == nums[next]) && (nums[mid] != nums[previous])) {
                    start = next;
                } else if ((nums[mid] == nums[previous]) && (nums[mid] != nums[next])) {
                    end = previous;
                } else {
                    return nums[mid];
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        SingleElementSortedArray array = new SingleElementSortedArray();
        System.out.println(array.singleNonDuplicate(new int[] { 1, 1, 3, 3, 4, 4, 2, 8, 8 }));
        System.out.println(array.singleNonDuplicate(new int[] { 3, 3, 7, 7, 10, 11, 11 }));
    }
}
