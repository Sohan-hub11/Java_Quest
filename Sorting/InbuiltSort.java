//Inbuilt Sorting.

package Sorting;
import java.util.*;
public class InbuiltSort {
    static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String[] args){
        int[] arr = {5, 4, 1, 3, 2};
        int[] arr1 = {6, 2, 9, 22, 11, 5, 18};
        System.out.println("Before Sorting arr..");
        printArray(arr);

        System.out.println("Using Inbuilt Sorting arr..");
        Arrays.sort(arr);
        printArray(arr);


        System.out.println("Before Sorting arr1...");
        printArray(arr1);

        System.out.println("Using indexing on arr1...");
        Arrays.sort(arr1, 0, 3);
        printArray(arr1);
    }
}
