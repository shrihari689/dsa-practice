package com.practice.string;

public class IsomorphicString {

    public boolean isIsomorphic(String s, String t) {

        int n = s.length();

        char memo[] = new char[256];
        char check[] = new char[256];

        for (int i = 0; i < n; ++i) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (memo[(int) a] == 0) {
                if (check[(int) b] != 0) {
                    return false;
                }
                memo[(int) a] = b;
                check[(int) b] = a;
            }

            if (memo[(int) a] != b) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        IsomorphicString isomorphicString = new IsomorphicString();
        System.out.println(isomorphicString.isIsomorphic("13", "42"));
        System.out.println(isomorphicString.isIsomorphic("bar", "foo"));
        System.out.println(isomorphicString.isIsomorphic("paper", "title"));
        System.out.println(isomorphicString.isIsomorphic("egg", "add"));
    }
}
