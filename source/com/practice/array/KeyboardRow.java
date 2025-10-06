package com.practice.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/keyboard-row
 */
public class KeyboardRow {

    private static final Set<Character> FIRST_ROW = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
    private static final Set<Character> SECOND_ROW = Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');

    public String[] findWords(String[] words) {
        int n = words.length;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            Integer row = null;
            boolean matches = true;
            for (char ch : words[i].toCharArray()) {
                ch = Character.toLowerCase(ch);
                int currRow = 0;
                if (FIRST_ROW.contains(ch)) {
                    currRow = 1;
                } else if (SECOND_ROW.contains(ch)) {
                    currRow = 2;
                } else {
                    currRow = 3;
                }
                if (row == null) {
                    row = currRow;
                } else if (row != currRow) {
                    matches = false;
                    break;
                }
            }
            if (matches) {
                result.add(words[i]);
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        KeyboardRow row = new KeyboardRow();
        System.out.println(row.findWords(new String[] { "Hello", "Alaska", "Dad", "Peace" }));
    }
}
