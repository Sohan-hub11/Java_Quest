//Intersection of 2 arrays.

package Hashing;
import java.util.*;
public class Intersection {
    public static void main(String[] args){
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i< arr2.length; i++){
            set.add(arr2[i]);
        }

        //checking whether arr1 contains the element in arr2 or not
        int count = 0;
        for(int i=0; i< arr1.length; i++){
            if(set.contains(arr1[i])){
                count++;
            }
        }

        System.out.println("Count for Intersection : " + count);
    }
}
