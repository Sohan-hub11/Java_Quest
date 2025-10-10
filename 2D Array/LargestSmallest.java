//Find Largest and Smallest of the Matrices.

package Array_2D;
import java.util.*;
public class LargestSmallest {
    static void printArray(int[][] arr){
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void largest_smallest(int[][] arr){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i< arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(largest < arr[i][j]){
                    largest = arr[i][j];
                }
                if(smallest > arr[i][j]){
                    smallest = arr[i][j];
                }
            }
        }
        System.out.println("Largest element of the Matrices : " + largest);
        System.out.println("Smallest element of the Matrices : " + smallest);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int n = arr.length;
        int m = arr[0].length;

        System.out.println("Enter " + n*m + " elements...");
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
        largest_smallest(arr);
    }
}
