package com.practice.sortingalgorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] inputArray = {9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0};
        MergeSort sorter = new MergeSort();
        sorter.sort(inputArray);
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }

    }

    private static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int start, int end) {
        if (end <= start) {
            return; // we're done traversing the array
        }
        int mid = (start + end) / 2;
        sort(a, start, mid); // sort left half
        sort(a, mid + 1, end);// sort right half
        merge(a, start, mid, end);

    }

    private static void merge(int[] inputArray, int start, int mid, int end) {
        int tempArray[] = new int[end - start + 1];

        //index counter for the left side of the array
        int leftSlot = start;
        //index counter for the right side of the array
        int rightSlot = mid + 1;

        int k = 0;

        while (leftSlot <= mid && rightSlot <= end) {
            if (inputArray[leftSlot] < inputArray[rightSlot]) {
                tempArray[k] = inputArray[leftSlot];
                leftSlot = leftSlot + 1;
            } else {
                tempArray[k] = inputArray[rightSlot];
                rightSlot = rightSlot + 1;
            }
            k = k + 1;
        }


        if (leftSlot <= mid) { // consider the right side done being sorted. Left must be sorted already
            while (leftSlot <= mid) {
                tempArray[k] = inputArray[leftSlot];
                leftSlot = leftSlot + 1;
                k = k + 1;
            }
        } else if (rightSlot <= end) {
            while (rightSlot <= end) {
                tempArray[k] = inputArray[rightSlot];
                rightSlot = rightSlot + 1;
                k = k + 1;
            }
        }

        // copy over the tmep array into the appropriate slots of the inputArray
        for (int i = 0; i < tempArray.length; i++) {
            inputArray[start + i] = tempArray[i];
        }

    }
}
