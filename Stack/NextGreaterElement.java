//Next Greater Element -- which comes first to the right of the element x.

package Stack;
import java.util.*;
public class NextGreaterElement {
    public static void Greater(int[] arr, int[] nextGreater){
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length-1; i>=0; i--){
            //1
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]){
                s.pop();
            }

            //2
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }

            //3
            else{
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String[] args){
        int[] arr = {6, 8, 0, 1, 3};
        int[] nextGreater = new int[arr.length];
        Greater(arr, nextGreater);
        for(int i=0; i< nextGreater.length; i++){
            System.out.print(nextGreater[i]+ " ");
        }
    }
}
