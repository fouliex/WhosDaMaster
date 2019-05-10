package review.array;

import java.util.Arrays;

/**
 * Created by George Fouche on 5/9/19.
 */
public class CheckReArrange {

    public static void main(String[] args) {
        int[] arr = {2, 4, -6, 8, -5, -10};
        System.out.println(Arrays.toString(reArrange(arr)));
    }

    private static int[] reArrange(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {   // if negative number found
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j]; // swapping with leftmost positive
                    arr[j] = temp;
                }
                j++;
            }
        }
        return arr;
    }
}
