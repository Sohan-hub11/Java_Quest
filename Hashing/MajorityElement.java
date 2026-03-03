//Find Majority element of the array that appears more than [n/3] times.

package Hashing;
import java.util.*;
public class MajorityElement {
    public static void findMajority(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        //mapping all element
        for(int i=0; i< n; i++){
            int num = arr[i];

            map.put(num, map.getOrDefault(num, 0)+1);
        }

        //iterate
        for(Integer key: map.keySet()){
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        //int[] arr = {1, 2};

        findMajority(arr);
    }
}
