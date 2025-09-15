package com.practice.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://takeuforward.org/plus/dsa/problems/counting-frequencies-of-array-elements
 */
public class CountFreqOfArray {

    public List<List<Integer>> countFrequencies(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Map<Integer, Integer> memo = new HashMap<>();
        for (int num : nums) {
            memo.put(num, memo.getOrDefault(num, 0) + 1);
        }

        for (Integer key : memo.keySet()) {
            Integer count = memo.get(key);
            result.add(List.of(key, count));
        }

        return result;
    }

    public static void main(String[] args) {
        CountFreqOfArray array = new CountFreqOfArray();
        System.out.println(array.countFrequencies(new int[] { 1, 2, 2, 1, 3 }));
        System.out.println(array.countFrequencies(new int[] { 5, 5, 5, 5 }));
    }
}
