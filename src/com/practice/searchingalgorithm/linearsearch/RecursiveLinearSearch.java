package com.practice.searchingalgorithm.linearsearch;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        System.out.println(recursiveLinearSearch(new int[]{1, 2, 3, 4, 7, 9, 12, 18, 20}, 0, 20));
    }

    private static int recursiveLinearSearch(int[] a, int i, int x) {
        if (i > a.length - 1) return -1;
        else if (a[i] == x) return i;
        else  return recursiveLinearSearch(a, i + 1, x);
    }
}
