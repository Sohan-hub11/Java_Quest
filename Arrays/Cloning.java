//Cloning of Array...

//As Array is mutable, meaning their elements can be changed, added, or
//removed after creation without creating a new array. So After normal copying, if any operations occurs then
//it changes the Original Array. To avoid such situation there are cloning functions available.

package Arrays;
import java.util.Scanner;
public class Cloning {
    public static void printarray(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Number..");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        printarray(arr);
    }
}
