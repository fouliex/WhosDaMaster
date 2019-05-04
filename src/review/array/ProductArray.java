package review.array;

import java.util.Arrays;

/**
 * Created by George Fouche on 5/3/19.
 */
public class ProductArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(Arrays.toString(findProduct(arr)));
    }

    private static int[] findProduct(int[] arr) {
        int n = arr.length;
        int i, temp = 1;

        int result[] = new int[n];

        // Initializing the result array by
        for (int j = 0; j < n; j++) {
            result[j] = 1;
        }

        //Product of elements on left side excluding arr[i]
        for (i = 0; i < n; i++) {
            result[i] = temp;
            temp *= arr[i];
        }

        //Initializing temp to 1 for product on right side
        temp = 1;

        //Product of elements on right side excluding arr[i]
        for (i = n - 1; i >= 0; i--) {
            result[i] *= temp;
            temp *= arr[i];
        }

        return result;

    }
}
