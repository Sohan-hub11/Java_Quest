//Normal Search Algorithm.. (Brute-Force Approach).

package Array_2D;
import java.util.*;
public class Search {
    static void search(int[][] arr, int key){ // O(n^2) -- Time Complexity.
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == key){
                    System.out.println("Element found in : (" + i + ", " + j + ") matrices.");
                }
                else
                    System.out.println("Not Found..");
            }
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("Initializing the 2D Array..");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the Element to Search : ");
        int k = sc.nextInt();

        search(matrix, k);

    }
}
