package com.practice.string;

public class ReverseSameVowelCount {
    public String reverseWords(String s) {

        StringBuilder builder = new StringBuilder();

        String[] words = s.split(" ");
        int n = words.length;

        int firstWordCount = countVowels(words[0]);
        builder.append(words[0] + " ");

        for (int i = 1; i < n; ++i) {
            int count = countVowels(words[i]);
            if (count == firstWordCount) {
                builder.append(reverse(words[i]));
            } else {
                builder.append(words[i]);
            }
            builder.append(" ");
        }

        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    private int countVowels(String word) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
                count++;
            }
        }
        return count;
    }

    private String reverse(String word) {
        StringBuilder revBuilder = new StringBuilder(word);
        return revBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        ReverseSameVowelCount count = new ReverseSameVowelCount();
        System.out.println(count.reverseWords("cat and mice"));
        System.out.println(count.reverseWords("book is nice"));
        System.out.println(count.reverseWords("banana healthy"));
    }
}
