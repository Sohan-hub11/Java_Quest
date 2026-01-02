//Merge Sort

package Divide_Conquer;

public class MergeSort {
    public static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void mergeSort(int[] arr, int si, int ei){
        //Base Case.
        if(si >= ei){
            return;
        }
        //Working.
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid); //left part
        mergeSort(arr, mid+1, ei); //right part
        merge(arr, si, ei, mid); //merging function
    }
    public static void merge(int[] arr, int si, int ei, int mid){
        int[] temp = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp array

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }
            else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i <= mid){ //remaining left part
            temp[k++] = arr[i++];
        }
        while (j <= ei) { //remaining right part
            temp[k++] = arr[j++];
        }

        //Copying from temp to original arr.
        for(k=0 ,i=si; k<= temp.length-1; k++ ,i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args){
        int[] arr = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
