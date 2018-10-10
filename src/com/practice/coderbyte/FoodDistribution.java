package com.practice.coderbyte;

import java.util.Arrays;

/**
 *
 * Using the Java language, have the function FoodDistribution(arr) read the array of numbers stored in arr which will represent
 * the hunger level of different people ranging from 0 to 5 (0 meaning not hungry at all, 5 meaning very hungry).
 * You will also have N sandwiches to give out which will range from 1 to 20.
 * The format of the array will be [N, h1, h2, h3, ...]
 * where N represents the number of sandwiches you have and the rest of the array will represent the hunger levels of different people.
 *
 * Your goal is to minimize the hunger difference between each pair of people in the array using the sandwiches you have available.
 *
 * For example:
 * if arr is [5, 3, 1, 2, 1], this means you have 5 sandwiches to give out. You can distribute them in the following
 * order to the people: 2, 0, 1, 0. Giving these sandwiches to the people their hunger levels now become: [1, 1, 1, 1].
 * The difference between each pair of people is now 0, the total is also 0, so your program should return 0.
 * Note: You may not have to give out all, or even any, of your sandwiches to produce a minimized difference.
 *
 * Another example:
 * if arr is [4, 5, 2, 3, 1, 0] then you can distribute the sandwiches in the following order: [3, 0, 1, 0, 0]
 * which makes all the hunger levels the following: [2, 2, 2, 1, 0].
 * The differences between each pair of people is now: 0, 0, 1, 1 and so your program should return the final minimized
 * difference of 2.
 *
 * Created by George Fouche on 10/8/18.
 */
public class FoodDistribution {

    public static String foodDistribution(int[] arr) {
        int togive = arr[0];
        int[] a = Arrays.copyOfRange(arr, 1, arr.length);
        while (togive > 0 )
            togive = apply(a, togive);

        int sum =0;
        for (int i = 0 ; i < a.length - 1; i++) {
            sum += Math.abs(a[i+1] - a[i]);
        }
        return ""+sum;
        // return Arrays.toString(a);
    }


    private static int apply(int[] a, int togive){
        int sum = 0;
        for (int i : a) sum+=i;
        int mean = sum/a.length;
        int first = togive;

        for (int i = 0 ; i < a.length; i++) {
            int x = a[i];
            if (x > mean) {
                int rem = Math.min(togive, x - mean);
                a[i]-=rem;
                togive-=rem;
                if (togive == 0) break;
            }
        }
        if (first == togive) return 0;
        return togive;
    }


    public static void main(String[] args) {
        int [] array =  new int[] {5, 3, 1, 2, 1};
        int [] array2 =  new int[] {4, 5, 2, 3, 1, 0};
        int [] array3 =  new int[] {1,2,3,100};
        System.out.println(foodDistribution(array));
        System.out.println(foodDistribution(array2));
        System.out.println(foodDistribution(array3));

    }
}
