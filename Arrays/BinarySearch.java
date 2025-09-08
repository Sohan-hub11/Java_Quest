//Binary Search.

package Arrays;
import java.util.*;
public class BinarySearch {
    public static int binarysearch(int arr[], int key){
        int start = 0, end = arr.length-1;

        //operations.....
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key){ //found
                return mid;
            }
            if(key > arr[mid]){ //right
                start = mid+1;
            }
            else{ //left
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("Enter the Array in Sorted manner..");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value to find..");
        int key = sc.nextInt();

        System.out.println("The value is found in the index num.."+ binarysearch(arr,key));
    }
}
