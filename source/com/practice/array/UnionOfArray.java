package com.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://takeuforward.org/plus/dsa/problems/union-of-two-sorted-arrays
 */
public class UnionOfArray {

    public Object[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();

        int aLen = nums1.length;
        int bLen = nums2.length;

        int i = 0;
        int j = 0;

        while ((i < aLen) && (j < bLen)) {
            int a = nums1[i];
            int b = nums2[j];

            int size = result.size();

            if (a <= b) {
                if ((size == 0) || (result.get(size - 1) != a)) {
                    result.add(a);
                }
                i++;
            } else {
                if ((size == 0) || (result.get(size - 1) != b)) {
                    result.add(b);
                }
                j++;
            }
        }

        while ((i < aLen) && (result.get(result.size() - 1) != nums1[i])) {
            result.add(nums1[i]);
        }

        while ((j < bLen) && (result.get(result.size() - 1) != nums2[j])) {
            result.add(nums2[j]);
        }

        return result.toArray();
    }

    public static void main(String[] args) {
        UnionOfArray array = new UnionOfArray();
        System.out.println(Arrays.toString(array.unionArray(new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 2, 7 })));
        System.out.println(
                Arrays.toString(array.unionArray(new int[] { 2, 3, 4, 6, 7, 9, 9 }, new int[] { 1, 5, 7, 8, 8 })));
    }
}
