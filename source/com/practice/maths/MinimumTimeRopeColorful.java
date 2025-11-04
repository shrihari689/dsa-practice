package com.practice.maths;

public class MinimumTimeRopeColorful {

    public int minCost(String colors, int[] neededTime) {

        int n = neededTime.length;

        char ch[] = colors.toCharArray();

        int time = 0;

        for (int i = 1; i < n; ++i) {
            if (ch[i] == ch[i - 1]) {
                time += Math.min(neededTime[i], neededTime[i - 1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1]);
            }
        }

        return time;
    }

    public static void main(String[] args) {
        MinimumTimeRopeColorful colorful = new MinimumTimeRopeColorful();
        System.out.println(colorful.minCost("bbbaaa", new int[] { 4, 9, 3, 8, 8, 9 }));
        System.out.println(colorful.minCost("cddcdcae", new int[] { 4, 8, 8, 4, 4, 5, 4, 2 }));
        System.out.println(colorful.minCost("abaac", new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(colorful.minCost("abc", new int[] { 1, 2, 3 }));
        System.out.println(colorful.minCost("aabaa", new int[] { 1, 2, 3, 4, 1 }));
    }
}
