package review.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by George Fouche on 5/9/19.
 */
public class CheckFirstUnique {

    public static void main(String[] args) {
        int[] arr = {9,2,3,2,6,6};

        System.out.println(findFirstUnique(arr));
    }

    private static int findFirstUnique(int[] arr) {
        Map<Integer,Integer> countElements = new HashMap<>();
        for(int i : arr){
            if(countElements.containsKey(i)){
                countElements.put(i, countElements.get(i)+1);
            }else{
                countElements.put(i,1);
            }
        }
        for(int i : arr){
            if(countElements.get(i) == 1) return i;
        }
        return -1;
    }
}
