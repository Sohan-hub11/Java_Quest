//Bottom Up Approach.

package Dynamic_Programming;

import java.util.Arrays;

public class FibBottomUp {
    static int fibonacci(int n, int[] dp){
        if(n <= 1)
            return n;

        return dp[n];
    }
    public static void main(String[] args){
        int n = 6;
        int[] dp = new int[n + 1];
        //find the base case
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i< dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(fibonacci(n, dp));

    }
}
