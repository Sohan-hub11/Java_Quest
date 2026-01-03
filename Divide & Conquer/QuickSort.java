//Quick Sort

package Divide_Conquer;

public class QuickSort {
    public static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void quickSort(int[] arr, int si, int ei){
        //Base Case.
        if(si >= ei){
            return;
        }

        //Working.
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); //left part.
        quickSort(arr, pIdx+1, ei); //right part.
    }
    public static int partition(int[] arr, int si, int ei){
        int i = si-1; //to make place for lesser element.
        int pivot = arr[ei];

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
    public static void main(String[] args){
        int[] arr = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
