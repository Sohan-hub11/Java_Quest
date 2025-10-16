// Diagonal Sum -- Optimized Approach.

package Array_2D;

public class DiagonalSum2 {
    static int diagonal_Sum(int[][] arr){
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            // Primary Diagonal.
            sum += arr[i][i];

            // Secondary Diagonal.
            if(i != arr.length-i-1)
                sum += arr[i][arr.length-i-1];
        }

        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11}
        };

        System.out.println(diagonal_Sum(matrix));
    }
}
