//Pascal's Triangle --

package Array_2D;
import java.util.*;
public class PascalsTriangle {
    static void printMatrices(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] pascalTriangle(int n){
        int[][] ans = new int[n][];
        for(int i=0; i<n; i++){
            //declaring column part.
            /*
                jagged array -- ith row has (i+1) column.
                i=0 means => row = 0, column = 1.
                i=1 means => row = 1, column = 2.
             */
            ans[i] = new int[i+1];

            //Each rows, first and last element having 1.
            ans[i][0] = ans[i][i] = 1;

            //calculating vacant places.
            for(int j=1; j<i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }

        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of the matrix : ");
        int n = sc.nextInt();

        int[][] ans = pascalTriangle(n);
        printMatrices(ans);
    }
}
