package com.practice.sortingalgorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] myArray = sort(new int[]{9, 8, 3, 13, 87, 12, 99});
        for (int i : myArray) {
            System.out.println(i);
        }

    }

    private static int[] sort(int[] a) {
        sort(a,0,a.length-1);
        return new int[0];

    }

    private static void sort(int[] a, int start, int end) {
        if(end <= start){
            return; // we're done traversing the array
        }
        int mid = (start +end)/2;
        sort(a,start,mid); // sort left half
        sort(a,mid+1,end);// sort right half
        merge(a,start,mid,end);

    }

    private static void merge(int[] a, int start, int mid, int end) {

    }
}
