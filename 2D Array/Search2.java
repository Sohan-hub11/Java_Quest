// Optimized Search Algorithm -- 2D Array.

package Array_2D;

public class Search2 {
    static boolean search(int[][] matrix, int k){ //Row-wise...
        int j = 0;
        for(int i=0; i< matrix.length; i++){
            j = binarySearch(matrix[i],k);
            if(j != -1){
                System.out.println("Found key- " + k + " at " + "(" + i + "," + j + ")");
                return true;
            }
        }
        System.out.println("Not Found.");
        return false;
    }

    static int binarySearch(int[] arr, int k){
        int first = 0;
        int last = arr.length-1;

        while(first <= last){
            int mid = (first + last)/2;

            if(k == arr[mid]){
                return mid;
            }
            if(k > arr[mid]){
                first = mid+1;
            }
            if(k < arr[mid]){
                last = mid-1;
            }
        }

        return -1;
    }

    static boolean stairCaseSearch(int[][] matrix, int k){ //Column-wise...
        int row = 0;
        int column = matrix.length - 1;

        while(row <= matrix.length - 1 && column >= 0){
            if(matrix[row][column] == k){
                System.out.println("Found key- " + k + " at " + "(" + row + "," + column + ")");
                return true;
            }
            if(k < matrix[row][column]){
                column --;
            }
            if(k > matrix[row][column]){
                row ++;
            }
        }
        System.out.println("Not Found.");
        return false;
    }
    public static void main(String[] args){
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 49},
                {32, 33, 39, 50}
        };
        int key = 33;

        //Row-wise searching. (n log n -- Complexity)
        System.out.println(search(matrix, key));

        //Column-wise searching or Stair-case Searching. (O(n+m) -- Complexity)
        System.out.println(stairCaseSearch(matrix, key));
    }
}
