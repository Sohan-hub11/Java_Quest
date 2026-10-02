//DP with Space Optimization Approach.

package Dynamic_Programming;

import java.util.Arrays;

public class FibSpaceOpti {
    static int fibonacci(int n){
        if(n <= 1)
            return n;

        if(n == 2)
            return 1;

        int[] dp = new int[n + 1];
        //find the base case
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for(int i=3; i< dp.length; i++){
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = dp[0] + dp[1];
        }

        return dp[2];
    }
    public static void main(String[] args){
        int n = 6;
        
        System.out.println(fibonacci(n));

    }
}
