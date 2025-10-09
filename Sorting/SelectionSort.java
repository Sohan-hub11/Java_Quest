//Selection Sort.

package Sorting;

public class SelectionSort {
    static void selection_sort(int[] arr){
        int n = arr.length;
        for(int i =0; i<n-1; i++){
            int minPos = i;
            for(int j = i+1; j<n; j++){
                //checking the min pos of the unsorted array.
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }

            //Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={5, 4, 1, 3, 2};
        System.out.println("Before Sorting..");
        printArray(arr);

        System.out.println("After Sorting..");
        selection_sort(arr);
        printArray(arr);
    }
}
