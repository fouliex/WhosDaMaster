package com.practice.interviewcake;

import java.util.Arrays;

/**
 * Given an array of integers, find the highest product you can get from three of the integers
 * Created by George Fouche on 10/10/17.
 */
public class HighestProductOf3 {

    public int highestProductOf3Example1(int[]arr){
        int result =1;
        Arrays.sort(arr);
        for(int i = arr.length-1; i > 0 ; i--){
            result *= arr[i];

        }
        return result;
    }

    public int highestProductOf3(int[] arr) {
        /**
         * We are going to start at the 3rd item (at int 2) so we
         * can pre-populate highest and lowest based on the first 2 items.
         *
         * For highestProductOf3 we pre-populate it for the first *3*  items which means in
         * our first pass it will check against itself.
         *
         *
         *
         */
        int highest = Math.max(arr[0], arr[1]);
        int lowest = Math.min(arr[0], arr[1]);

        int highestProductOf2 = arr[0] * arr[1];
        int lowestProductOf2 = arr[0] * arr[1];


        int highestProductOf3 = arr[0] * arr[1] * arr[2];

        for (int i = 2; i < arr.length; i++) {
            int current = arr[i];

            highestProductOf3 = Math.max(Math.max(highestProductOf3, current * highestProductOf2), current * lowestProductOf2);

            // do we have a new highest product of 2?
            highestProductOf2 = Math.max(Math.max(
                    highestProductOf2, current * highest), current * lowest);

            // do we have a new lowest product of 2?
            lowestProductOf2 = Math.min(
                    Math.min(lowestProductOf2, current * highest), current * lowest);

            // do we have a new highest?
            highest = Math.max(highest, current);

            // do we have a new lowest?
            lowest = Math.min(lowest, current);

        }
        return highestProductOf3;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 10, 5, 100};
        HighestProductOf3 highestProductOf3 = new HighestProductOf3();
        System.out.println(highestProductOf3.highestProductOf3(arr));
        System.out.println(highestProductOf3.highestProductOf3Example1(arr));
    }

}
