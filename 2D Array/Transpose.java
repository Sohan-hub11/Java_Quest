//Transpose - 2D Array (Brute Approach).

package Array_2D;
import java.util.*;
public class Transpose {
    static int[][] findTranspose(int[][] arr, int r, int c){
        int[][] ans = new int[c][r];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }
    static void printMatrices(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Initializing --
        System.out.println("Enter row and column of the Matrix...");
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
        int ans[][] = findTranspose(arr, r, c);
        System.out.println("Matrix after Transpose...");
        printMatrices(ans);
    }
}
