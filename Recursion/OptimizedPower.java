//Print x to the power n (Optimized Approach)--
//Time Complexity -- O(log n)

package Recursion;

public class OptimizedPower {
    public static int optimizedPow(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPow = optimizedPow(x, n/2);
        int halfPowSq = halfPow * halfPow;

        //for Odd Case.
        if(n%2 != 0){
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }
    public static void main(String[] args){
        System.out.println(optimizedPow(2, 10));
    }
}
