//Trapping Rainwater Problem.

package Arrays;
import java.util.*;
public class TrappingRainwater {
    static int trappedwater(int[] height){  //O(n)...Time Complexity.
        int n = height.length;
        int trapwater = 0;
        //Left Max Boundary - array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //Right Max Boundary - array
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //Loop...
        for(int i = 0; i < n; i++) {
            //Finding WaterLevel
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            //Finding Trapped Water
            trapwater += waterlevel - height[i];
        }
        return trapwater;
    }
    public static void main(String[] args){
        int[] height={4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedwater(height));
    }
}
