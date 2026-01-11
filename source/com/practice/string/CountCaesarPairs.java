package com.practice.string;

import java.util.*;

public class CountCaesarPairs {

    public long countPairs(String[] words) {
        Map<String, Integer> signatureCount = new HashMap<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                int diff = (c - word.charAt(0) + 26) % 26;
                sb.append(diff).append(",");
            }
            String signature = sb.toString();
            signatureCount.put(signature, signatureCount.getOrDefault(signature, 0) + 1);
        }

        long count = 0;
        for (int freq : signatureCount.values()) {
            count += (long) freq * (freq - 1) / 2;
        }
        return count;
    }

    public static void main(String[] args) {
        CountCaesarPairs pairs = new CountCaesarPairs();
        System.out.println(pairs.countPairs(new String[] { "fusion", "layout" })); // Output: 0
        System.out.println(pairs.countPairs(new String[] { "ab", "aa", "za", "aa" })); // Output: 4
    }
}
