package com.practice.string;

import java.util.Arrays;

public class SortCharactersByFrequency {

    public class Pair {
        private char ch;
        private int count;

        Pair(char ch) {
            this.ch = ch;
            this.count = 1;
        }

        public char getChar() {
            return this.ch;
        }

        public void increment() {
            this.count += 1;
        }

        public int getCount() {
            return this.count;
        }

        @Override
        public String toString() {
            return "[ " + this.ch + " = " + count + " ]";
        }
    }

    public String frequencySort(String s) {
        StringBuilder builder = new StringBuilder();

        Pair[] pairs = new Pair[62];
        for (char ch : s.toCharArray()) {
            int key = 0;
            if ((ch >= 'a') && (ch <= 'z')) {
                key = (int) (ch - 'a');
            } else if ((ch >= 'A') && (ch <= 'Z')) {
                key = 26 + ((int) (ch - 'A'));
            } else {
                key = 52 + ((int) (ch - '0'));
            }

            if (pairs[key] != null) {
                pairs[key].increment();
            } else {
                pairs[key] = new Pair(ch);
            }
        }

        Arrays.sort(pairs, (a, b) -> {
            if (a == null && b == null)
                return 0;
            if (a == null)
                return 1;
            if (b == null)
                return -1;
            return b.getCount() - a.getCount();
        });

        for (int i = 0; i < pairs.length; ++i) {
            if (pairs[i] == null) {
                break;
            }
            char ch = pairs[i].getChar();
            int count = pairs[i].getCount();
            for (int j = 0; j < count; ++j) {
                builder.append(ch);
            }
        }

        return builder.toString();

    }

    public static void main(String[] args) {
        SortCharactersByFrequency frequency = new SortCharactersByFrequency();
        System.out.println(frequency.frequencySort("tree"));
        System.out.println(frequency.frequencySort("cccaaa"));
        System.out.println(frequency.frequencySort("Aabb"));
    }
}
