//Addition of 2 Matrices...

package Array_2D;
import java.util.*;
public class Addition {
    static void addition(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
        int[][] sum = new int[r1][c1];
        if(r1 != r2 || c1 != c2){
            System.out.println("Different Matrices Dimension. Addition not possible");
            return;
        }
        
        for(int i =0; i< arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum matrices.");
        printMatrices(sum);
    }
    static void printMatrices(int[][] arr){
        for(int i =0; i< arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Initializing Matrices 1 --
        System.out.println("Enter row and column of Matrices 1...");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter " + r1 + " * " + c1 + " value..");
        for(int i =0; i< arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        //Initializing Matrices 2 --
        System.out.println("Enter row and column of Matrices 2...");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter " + r2 + " * " + c2 + " value ..");
        for(int i =0; i< arr2.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        //Printing Matrices --
        System.out.println("1st matrices.");
        printMatrices(arr1);
        System.out.println("2nd matrices.");
        printMatrices(arr2);

        //Printing Sum Matrices --
        addition(arr1, r1, c1, arr2, r2, c2);
    }
}

