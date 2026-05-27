//Single Number-II
//find the number in the array which is not repeating while others are 3-times.

package BitManipulation;
import java.util.*;
public class SingleNum2 {
    static int findSingleNum(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);

        for(int i=1; i<n; i+=3){
            if(arr[i] != arr[i-1])
                return arr[i-1];
        }

        return arr[n-1];
    }
    public static void main(String[] args){
        //int[] arr = {5, 5, 5, 2, 2, 2, 4, 4, 4, 3};
        int[] arr = {5, 2, 2, 2, 4, 4, 4};

        System.out.println(findSingleNum(arr));
    }
}
