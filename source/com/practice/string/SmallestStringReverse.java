package com.practice.string;

import java.util.ArrayList;
import java.util.List;

public class SmallestStringReverse {

    public String lexSmallest(String s) {
        int n = s.length();
        char minChar = 'z' + 1;

        for (char c : s.toCharArray()) {
            if (c < minChar)
                minChar = c;
        }

        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == minChar)
                positions.add(i);
        }

        String best = s;

        for (int pos : positions) {
            int k = pos + 1;
            String candidate = new StringBuilder(s.substring(0, k)).reverse().toString() + s.substring(k);
            if (candidate.compareTo(best) < 0)
                best = candidate;
        }

        for (int k = 1; k <= n; k++) {
            String candidate = s.substring(0, n - k) + new StringBuilder(s.substring(n - k)).reverse().toString();
            if (candidate.compareTo(best) < 0)
                best = candidate;
        }

        return best;
    }

    public static void main(String[] args) {
        SmallestStringReverse reverse = new SmallestStringReverse();
        System.out.println(reverse.lexSmallest("baca"));
        System.out.println(reverse.lexSmallest("abba"));
        System.out.println(reverse.lexSmallest("dcab"));
        System.out.println(reverse.lexSmallest("abba"));
        System.out.println(reverse.lexSmallest("zxy"));
    }
}
