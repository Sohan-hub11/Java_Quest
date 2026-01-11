//To find max Area in Histogram.

package Stack;
import java.util.*;
public class HistogramArea {
    public static int findMaxArea(int[] arr){
        int maxArea = 0;
        int[] nsl = new int[arr.length];
        int[] nsr = new int[arr.length];

        //Next Smaller Left
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i< arr.length; i++){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //Next Smaller Right
        s = new Stack<>();

        for(int i = arr.length-1; i>= 0; i--){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //find Area
        for(int i=0; i<arr.length; i++){
            int area = arr[i] * (nsr[i] - nsl[i] - 1);
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }
    public static void main(String[] args){
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(findMaxArea(heights));
    }
}
