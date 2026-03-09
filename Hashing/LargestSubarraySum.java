//Largest Sub array with Sum 0

package Hashing;
import java.util.*;
public class LargestSubarraySum {
    public static void main(String[] args){
        int[] arr = {15, -2, 2, -8, 1, 7, 10};
        int len = Integer.MIN_VALUE;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int j=0; j< arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len, (j - map.get(sum)));
            } else {
                map.put(sum, j);
            }
        }

        System.out.println(len);
    }
}
