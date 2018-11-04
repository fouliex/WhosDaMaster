package com.practice.searchingalgorithm.binarysearch;

public class RecursiveBinarySearch {

    public static void main(String[] args) {
        System.out.println(recursiveSearch(new int[]{1,2,3,4,7,9,12,18,12},2));
    }

    private static int recursiveSearch(int[] a, int x) {
        return recursiveBinarySearch(a,0,a.length-1,x);

    }

    private static int recursiveBinarySearch(int[] a, int p, int r, int x) {

        if(p >r){
            return -1;
        }

        else{
            int q = (p+r)/2;
            if(a[q] == x) return q;
            else if (a[q] >x) return recursiveBinarySearch(a,p,q-1,x);
            else return recursiveBinarySearch(a,q+1,r,x);
        }

    }
}
