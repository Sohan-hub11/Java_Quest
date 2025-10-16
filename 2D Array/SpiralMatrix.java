//Spiral Matrix...

package Array_2D;

public class SpiralMatrix {
    static void printSpiral(int[][] arr){
        int startRow = 0;
        int endRow = arr.length-1;
        int startCol = 0;
        int endCol = arr[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            //Top.
            for(int j=startCol; j<=endCol; j++){
                System.out.print(arr[startRow][j] + " ");
            }

            //Right.
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(arr[i][endCol] + " ");
            }

            //Bottom.
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    return;
                }
                System.out.print(arr[endRow][j] + " ");
            }

            //Left.
            for(int i=endRow-1; i>startRow; i--){
                if(startCol == endCol){
                    return;
                }
                System.out.print(arr[i][startCol] + " ");
            }

            //Updating rows and column.
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String[] args){
        int[][] matrix = {  {1, 2, 3, 4, 21},
                            {5, 6, 7, 8, 22},
                            {9, 10, 11, 12, 23},
                            {13, 14, 15, 16, 24},
                            {17, 18, 19, 20, 25}
                            };

        printSpiral(matrix);
    }
}
