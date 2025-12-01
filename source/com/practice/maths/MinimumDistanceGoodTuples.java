package com.practice.maths;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class MinimumDistanceGoodTuples {

    public int minimumDistance(int[] nums) {

        int n = nums.length;

        Map<Integer, LinkedList<Integer>> memo = new HashMap<>();

        int minDistance = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < n; ++i) {
            int num = nums[i];
            LinkedList<Integer> indices = memo.get(num);
            if (indices == null) {
                indices = new LinkedList<>();
            }
            indices.add(i);
            int count = indices.size();
            if (count == 3) {
                minDistance = Math.min(minDistance, calculateDistance(indices));
                found = true;
                indices.removeFirst();
            }
            memo.put(num, indices);
        }

        return found ? minDistance : -1;
    }

    private int calculateDistance(LinkedList<Integer> indices) {
        Iterator<Integer> iterator = indices.iterator();
        int a = iterator.next();
        int b = iterator.next();
        int c = iterator.next();
        return Math.abs(b - a) + Math.abs(c - b) + Math.abs(c - a);
    }

    public static void main(String[] args) {
        MinimumDistanceGoodTuples goodTuples = new MinimumDistanceGoodTuples();
        System.out.println(goodTuples.minimumDistance(new int[] { 5, 5, 5, 2, 5 }));
        System.out.println(goodTuples.minimumDistance(new int[] { 1, 2, 1, 1, 3 }));
        System.out.println(goodTuples.minimumDistance(new int[] { 1, 1, 2, 3, 2, 1, 2 }));
        System.out.println(goodTuples.minimumDistance(new int[] { 1 }));
    }
}
