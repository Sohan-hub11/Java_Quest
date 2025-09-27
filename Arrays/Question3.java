//Program to print Smallest and Largest element of the array in the array pair.

package Arrays;
import java.util.*;
//import java.util.Arrays;
public class Question3 {
    public static int[] smallestlargestpair(int arr[]){

        Arrays.sort(arr); //Sorting Array with inbuilt Array functions.

        int ans[] = {arr[0],arr[arr.length-1]};

        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the values of the Array...");
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        smallestlargestpair(arr);
        int result[] = smallestlargestpair(arr);
        System.out.println("Smalest : "+result[0]);
        System.out.println("Largest : "+result[1]);
    }
}
