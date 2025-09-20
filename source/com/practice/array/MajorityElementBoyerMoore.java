package com.practice.array;

public class MajorityElementBoyerMoore {

    public int majorityElement(int[] nums) {

        int n = nums.length;

        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < n; ++i) {
            if (candidate != nums[i]) {
                count--;
            } else {
                count++;
            }
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }

        count = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == candidate) {
                count++;
            }
        }

        int mid = n / 2;
        if (count > mid) {
            return candidate;
        }

        return -1;
    }

    public static void main(String[] args) {

        MajorityElementBoyerMoore moore = new MajorityElementBoyerMoore();
        System.out.println(moore.majorityElement(new int[] { 3, 2, 3 }));
        System.out.println(moore.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
    }
}
