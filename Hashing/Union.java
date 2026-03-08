//Finding Union of 2 array.

package Hashing;
import java.util.*;
public class Union {
    public static void main(String[] args){
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i< arr2.length; i++){
            if(i < arr1.length) {
                set.add(arr1[i]);
            }
            set.add(arr2[i]);
        }

        System.out.println("Count for Union of 2 array is " + set.size());
    }
}
