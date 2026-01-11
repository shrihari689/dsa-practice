package com.practice.string;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] words) {

        String prefix = minLengthWord(words);
        if (prefix.isEmpty()) {
            return prefix;
        }

        for (String word : words) {
            while (!word.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    private String minLengthWord(String words[]) {
        String min = words[0];
        int minLength = min.length();
        for (String word : words) {
            if (word.length() < minLength) {
                min = word;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        LongestCommonPrefix commonPrefix = new LongestCommonPrefix();
        System.out.println(commonPrefix.longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
        System.out.println(commonPrefix.longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
    }
}
