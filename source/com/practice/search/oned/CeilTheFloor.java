package com.practice.search.oned;

import java.util.Arrays;

public class CeilTheFloor {

    private int findCeil(int nums[], int target) {
        int n = nums.length;

        int start = 0;
        int end = n - 1;

        int ceil = -1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] >= target) {
                ceil = nums[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ceil;
    }

    private int findFloor(int nums[], int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        int floor = -1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] <= target) {
                floor = nums[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return floor;
    }

    public int[] getFloorAndCeil(int[] a, int x) {
        int result[] = new int[2];

        // floor:
        result[0] = findFloor(a, x);

        // ceil: lower bound
        result[1] = findCeil(a, x);

        System.out.println(Arrays.toString(result));

        return result;
    }

    public static void main(String[] args) {
        CeilTheFloor ceilTheFloor = new CeilTheFloor();
        System.out.println(ceilTheFloor.getFloorAndCeil(new int[] { 2 }, 23));
        System.out.println(ceilTheFloor.getFloorAndCeil(new int[] { 3, 4, 4, 7, 8, 10 }, 8));
        System.out.println(ceilTheFloor.getFloorAndCeil(new int[] { 3, 4, 4, 7, 8, 10 }, 2));
    }
}
