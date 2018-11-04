package com.practice.searchingalgorithm.linearsearch;

public class LinearSearch {

    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1,2,3,4,7,9,12,18,12},12));
    }

    private static int linearSearch(int[] a, int x) {
        for(int i =0; i < a.length; i++){
            if (a[i] == x) return i;
        }
        return -1;
    }
}
