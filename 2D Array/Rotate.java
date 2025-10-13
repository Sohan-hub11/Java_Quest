//Rotation -- 2D Array.

package Array_2D;
import java.util.*;
public class Rotate {
    static void printMatrices(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeInPlace(int[][] arr, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                //Swap.
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void rotation(int[][] arr, int n){
        //Transpose.
        transposeInPlace(arr, n, n);

        //Reversing each row of the matrix.
        for(int i=0; i<n; i++){
            /*
                pointing each row--
                i =0, means arr[0] = {} each row of 2D Array.
                            arr[1] = {}
                            arr[i] = {}
             */
            reverseInArray(arr[i], n);
        }

        //Printing the Rotated matrix.
        System.out.println("Matrix after Rotation.");
        printMatrices(arr);
    }

    static void reverseInArray(int[] arr1, int n){
        int i = n-1;
        int j = 0;
        while(i > j){
            int temp = arr1[j];
            arr1[j] = arr1[i];
            arr1[i] = temp;
            i--;
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Initializing --
        System.out.println("Enter row/column of the Matrix...(Only Square Matrix).");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter " + n + " * " + n + " value..");
        for (int i = 0; i < n; i++) { //Row
            for (int j = 0; j < n; j++) { //Column
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix ...");
        printMatrices(arr);

        rotation(arr, n);
    }
}