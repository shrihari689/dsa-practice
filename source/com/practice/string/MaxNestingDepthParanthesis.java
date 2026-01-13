package com.practice.string;

public class MaxNestingDepthParanthesis {
    public int maxDepth(String s) {
        int maxDepth = 0;

        int depth = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } else if (ch == ')') {
                depth--;
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {
        MaxNestingDepthParanthesis paranthesis = new MaxNestingDepthParanthesis();
        System.out.println(paranthesis.maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(paranthesis.maxDepth("()(())((()()))"));
        System.out.println(paranthesis.maxDepth("(1)+((2))+(((3)))"));
    }
}
