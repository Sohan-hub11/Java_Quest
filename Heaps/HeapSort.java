//Sorting in Ascending Order by Heap Sort

package Heaps;

public class HeapSort {
    public static void heapSort(int[] arr){
        int n = arr.length;

        //Step 1 -> maxHeap Creation
        for(int i=n/2; i>=0; i--){
            heapify(arr, i, n);
        }

        //Step 2 -> Largest-First element swap with last.
        for(int i=n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0, i);
        }
    }

    public static void heapify(int[] arr, int i, int n){
        int left = 2*i + 1;
        int right = 2*i + 2;
        int maxIdx = i;

        if(left < n && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }

        if(right < n && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != i){
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;

            heapify(arr, maxIdx, n);
        }
    }

    public static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5, 3};

        printArray(arr);

        heapSort(arr);
        printArray(arr);
    }
}
