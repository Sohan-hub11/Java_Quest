// Bubble Sort

package Sorting;

public class BubbleSort {
    static void bubble_sort(int[] arr){
        int n = arr.length;
        for(int turns = 0; turns < n-1; turns++){
            for(int j = 0; j<n-1-turns; j++){
                //compare the pointed element with the next element, then swap accordingly.
                if(arr[j] > arr[j+1]){
                    //swap
                    swap(arr, j, j+1);
                }
            }
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {5, 4, 1, 3, 2};
        System.out.println("Before Sorting..");
        printArray(arr);

        System.out.println("After Sorting..");
        bubble_sort(arr); //Sorting the array.
        printArray(arr);

    }
}

