//The zero relocation task -- task is to mave all the zeroes to the end of the list without
//changing the order of the other numbers. You must do this in-place, without using extra space.

package MixedQuestions;

public class Q1 {
    public static void getZeroRelocation(int[] arr){
        //Setting j pointer.
        int j = 0;
        for(int k=0; k<arr.length; k++){
            if(arr[k] == 0){
                j = k;
                break;
            }
        }
        if(j == 0){
            return;
        }

        //Declaring i pointer.
        for(int i=j+1; i< arr.length; i++){
            if(arr[i] != 0){
                //swap
                swap(arr, i, j);
                j++;
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1, 0, 2, 3, 0, 0, 5, 0, 2};
        printArray(arr);
        getZeroRelocation(arr);
        printArray(arr);

    }
}
