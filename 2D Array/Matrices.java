//Creation of 2D Array...

package Array_2D;
import java.util.*;
public class Matrices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][3];
        int n = arr.length;
        int m = arr[0].length;

        System.out.println("InitialiZing the 2D Array..");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing of 2D Array..");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
