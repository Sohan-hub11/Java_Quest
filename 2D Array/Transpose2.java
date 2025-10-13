//Transposing - 2D Array (Optimized Way)
// -- Also applicable only for Squared Matrix.

package Array_2D;
import java.util.*;
public class Transpose2 {
    static void printMatrices(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] transposeInPlace(int[][] arr, int r, int c){
        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){ // 'j' starts from 'i' everytime to avoid 2 times swapping.
                //Swap.
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Initializing --
        System.out.println("Enter row and column of the Matrix...(Only Square Matrix).");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter " + r + " * " + c + " value..");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix before Transpose...");
        printMatrices(arr);

        //Finding Transpose Matrix.
        System.out.println("Matrix after Transpose");
        transposeInPlace(arr, r, c);
        printMatrices(arr);
    }
}
