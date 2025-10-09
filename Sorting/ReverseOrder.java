//Reverse Order using Collections..

package Sorting;
import java.util.*;
public class ReverseOrder {
    static void printArray(Integer[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Integer[] arr2 = {6, 8, 1, 5, 7, 0, 4};
        Integer[] arr1 = {6, 2, 9, 22, 11, 5, 18};
        System.out.println("Before Reversing arr2..");
        printArray(arr2);

        System.out.println("Using Inbuilt Reversing on arr2..");
        Arrays.sort(arr2,Collections.reverseOrder());
        printArray(arr2);


        System.out.println("Before Reverse arr1...");
        printArray(arr1);

        System.out.println("Using indexing on arr1...");
        Arrays.sort(arr1, 3, 7, Collections.reverseOrder());
        printArray(arr1);
    }
}
