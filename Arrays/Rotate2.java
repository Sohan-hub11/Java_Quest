//Rotate the array by 'k' steps without  extra space

package Arrays;
import java.util.*;
public class Rotate2 {
    static int[] rotateInArray(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

        return arr;
    }
    static void swapInArray(int[] arr, int first, int last){
        int temp =0;
        temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
    public static void reverse(int arr[], int i, int j){
        //Swap
        while(i < j){
            swapInArray(arr, i, j);
            i ++;
            j --;
        }
    }

    static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        printArray(arr);
        System.out.println("Enter of times to Rotate : ");
        int k = sc.nextInt();

        int ans[] = rotateInArray(arr,k);
        printArray(ans);
    }
}
