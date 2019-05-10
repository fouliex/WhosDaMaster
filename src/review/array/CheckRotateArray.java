package review.array;

import java.util.Arrays;

/**
 * Created by George Fouche on 5/9/19.
 */
public class CheckRotateArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        //System.out.println(Arrays.toString(rotateArrayExp1(arr)));
        System.out.println(Arrays.toString(rotateArrayExp2(arr)));

    }

    private static int[] rotateArrayExp1(int[] arr) {
        int lastElement = arr[arr.length-1];

        for(int i = arr.length -1; i >0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = lastElement;

        return arr;
    }

    private static int[] rotateArrayExp2(int[] nums) {
        int k = 1;
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k ) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }

        return nums;
    }
}
