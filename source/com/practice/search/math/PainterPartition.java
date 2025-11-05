package com.practice.search.math;

import java.util.ArrayList;

public class PainterPartition {

    public static int findLargestMinDistance(ArrayList<Integer> boards, int k) {

        int start = 0;
        int end = 0;

        for (int board : boards) {
            start = Math.max(start, board);
            end += board;
        }

        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canPaint(boards, k, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    private static boolean canPaint(ArrayList<Integer> boards, int painters, int maxTimePerPainter) {

        int paintersNeeded = 1;

        int books = boards.size();

        int timeUsed = 0;
        for (int i = 0; i < books; ++i) {
            int board = boards.get(i);
            if ((timeUsed + board) > maxTimePerPainter) {
                paintersNeeded++;
                timeUsed = board;
            } else {
                timeUsed += board;
            }
            if (paintersNeeded > painters) {
                return false;
            }
        }

        return paintersNeeded <= painters;
    }

    private static int findLargestMinDistance(int boards[], int k) {
        ArrayList<Integer> boardList = new ArrayList<>();
        for (int board : boards) {
            boardList.add(board);
        }
        return findLargestMinDistance(boardList, k);
    }

    public static void main(String[] args) {
        System.out.println(PainterPartition.findLargestMinDistance(new int[] { 2, 1, 5, 6, 2, 3 }, 2));
        System.out.println(PainterPartition.findLargestMinDistance(new int[] { 10, 20, 30, 40 }, 2));
    }
}
