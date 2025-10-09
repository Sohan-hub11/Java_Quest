//Counting Sort.

package Sorting;

public class CountingSort {
    public static void counting_sort(int[] arr){
        int max = Integer.MIN_VALUE;
        //finding Max.
        for(int i=0; i< arr.length; i++){
            max = Math.max(arr[i], max);
        }

        //Count Freq of each element in -- array
        int[] count = new int[max+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //Sorting.
        int j=0;
        for(int i=0; i< count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1, 4, 1, 3, 2, 4, 3, 7};
        System.out.println("Before Sorting..");
        printArray(arr);

        counting_sort(arr);
        System.out.println("After Sorting..");
        printArray(arr);
    }
}
