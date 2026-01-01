//To find First Occurence of an Array.

package Recursion;

public class FirstOccurence {
    public static int firstOcc(int[] arr, int i, int key){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOcc(arr, i+1, key);
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 5, 8, 4, 6, 7, 5};
        System.out.println(firstOcc(arr, 0, 5));
    }
}
