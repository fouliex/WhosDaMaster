package review.array;

import java.util.Arrays;

/**
 * Created by George Fouche on 5/9/19.
 */
public class CheckMinimum {


    public static void main(String[] args) {
        int[] arr = {9,2,3,6};
        System.out.println((findMinimum(arr)));
    }

    private static int findMinimum(int[]arr) {
        int min = arr[0];
        for(int x : arr){
            if(x< min){
                min = x;
            }
        }
        return min;

    }

}
