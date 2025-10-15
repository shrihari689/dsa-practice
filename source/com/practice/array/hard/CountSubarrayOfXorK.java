package com.practice.array.hard;

import java.util.HashMap;
import java.util.Map;

public class CountSubarrayOfXorK {

    public int subarraysWithXorK(int[] nums, int k) {

        int count = 0;
        int n = nums.length;

        int xor = 0;
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(xor, 1);

        for (int i = 0; i < n; ++i) {

            xor = xor ^ nums[i];

            int x = xor ^ k;

            if (memo.containsKey(x)) {
                count += memo.get(x);
            }

            if (memo.containsKey(xor)) {
                memo.put(xor, memo.get(xor) + 1);
            } else {
                memo.put(xor, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountSubarrayOfXorK subarrayOfXorK = new CountSubarrayOfXorK();
        System.out.println(subarrayOfXorK.subarraysWithXorK(new int[] { 4, 2, 2, 6, 4 }, 6));
        System.out.println(subarrayOfXorK.subarraysWithXorK(new int[] { 5, 6, 7, 8, 9 }, 5));
    }
}
