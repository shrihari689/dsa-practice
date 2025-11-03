package com.practice.maths;

import java.util.ArrayList;
import java.util.List;

public class FindMissingElements {

    public List<Integer> findMissingElements(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int memo[] = new int[101];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            memo[num] = 1;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; ++i) {
            if (memo[i] == 0) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FindMissingElements elements = new FindMissingElements();
        System.out.println(elements.findMissingElements(new int[] { 1, 4, 2, 5 }));
        System.out.println(elements.findMissingElements(new int[] { 7, 8, 6, 9 }));
        System.out.println(elements.findMissingElements(new int[] { 5, 1 }));
    }
}
