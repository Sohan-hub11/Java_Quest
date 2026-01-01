//To find Last Occurence of an Array.

package Recursion;

public class LastOccurence {
    public static int lastOcc(int[] arr, int i, int key){
        if(i == arr.length){
            return -1;
        }
        int foundkey = lastOcc(arr, i+1, key);
        if(foundkey == -1 && arr[i] == key){
            return i;
        }

        return foundkey;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 5, 8, 4, 6, 7, 5};
//        int[] arr = {5, 5, 5, 5};
        System.out.println(lastOcc(arr, 0, 5));
    }
}
