package com.practice.string;

public class CountResiduePrefix {
    public int residuePrefixes(String s) {

        int count = 0;
        int unique = 0;

        int n = s.length();

        int memo[] = new int[26];

        for (int i = 0; i < n; ++i) {
            char ch = s.charAt(i);
            int key = (int) (ch - 'a');
            if (memo[key] == 0) {
                memo[key] = 1;
                unique++;
            }

            if (((i + 1) % 3) == unique) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountResiduePrefix prefix = new CountResiduePrefix();
        System.out.println(prefix.residuePrefixes("abc"));
        System.out.println(prefix.residuePrefixes("dd"));
        System.out.println(prefix.residuePrefixes("bob"));
    }
}
