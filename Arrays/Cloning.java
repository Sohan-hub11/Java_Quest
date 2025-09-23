//Cloning of Array...

//As Array is mutable, meaning their elements can be changed, added, or
//removed after creation without creating a new array. So After normal copying, if any operations occurs then
//it changes the Original Array. To avoid such situation there are cloning functions available.

package Arrays;
import java.util.Scanner;
public class Cloning {
    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void changearray(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = 0;
      }

    }
    public static void main(String[] args){
        int arr[] = {2,4,8,11,18}; //Initializing Original Array.
        System.out.println("Original Array...");
        printarray(arr);
        System.out.println("Copied Array...");
        //int[] arr2 = arr;
        //by this both the array points the same heap memory. Instead use cloning.

        int[] arr2 = arr.clone();
        //its make a dublicate array and make changes without affecting the original Array.

        printarray(arr2);

        changearray(arr2); //Changing the arr2

        System.out.println("Original Array after changing arr2...");
        printarray(arr);
        System.out.println("Copied Array after changing arr2...");
        printarray(arr2);
    }
}
