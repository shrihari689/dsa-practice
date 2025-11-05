package com.practice.search.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AllocateBooks {

    public static int findPages(ArrayList<Integer> pages, int books, int students) {

        if (students > books) {
            return -1;
        }

        int start = 0;
        int end = 0;

        for (int page : pages) {
            start = Math.max(start, page);
            end += page;
        }

        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canAssign(pages, students, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    private static boolean canAssign(ArrayList<Integer> pages, int students, int maxPagesPerStudent) {

        int studentsAssigned = 1;

        int books = pages.size();

        int pagesUsed = 0;
        for (int i = 0; i < books; ++i) {
            int page = pages.get(i);
            if ((pagesUsed + page) > maxPagesPerStudent) {
                studentsAssigned++;
                pagesUsed = page;
            } else {
                pagesUsed += page;
            }
            if (studentsAssigned > students) {
                return false;
            }
        }

        return studentsAssigned <= students;
    }

    private static int findPages(int[] pages, int students) {
        return findPages(new ArrayList<>(Arrays.stream(pages).boxed().collect(Collectors.toList())), pages.length,
                students);
    }

    public static void main(String[] args) {
        System.out.println(AllocateBooks.findPages(new int[] { 2, 8, 8, 4, 5 }, 6));
        System.out.println(AllocateBooks.findPages(new int[] { 12, 34, 67, 90 }, 2));
        System.out.println(AllocateBooks.findPages(new int[] { 1, 17, 14, 9, 15, 9, 14 }, 7));
        System.out.println(AllocateBooks.findPages(new int[] { 25, 46, 28, 49, 24 }, 4));
    }
}
