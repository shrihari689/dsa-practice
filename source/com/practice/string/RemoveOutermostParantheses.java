package com.practice.string;

public class RemoveOutermostParantheses {

    public String removeOuterParentheses(String s) {

        StringBuilder builder = new StringBuilder();

        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == ')')
                depth--;
            if (depth > 0)
                builder.append(ch);
            if (ch == '(')
                depth++;
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        RemoveOutermostParantheses parantheses = new RemoveOutermostParantheses();
        System.out.println(parantheses.removeOuterParentheses("(()())(())"));
        System.out.println(parantheses.removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(parantheses.removeOuterParentheses("()()"));
    }
}
