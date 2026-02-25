//Grid Ways Problem (Optimized Way).

package Backtracking;

public class GridWays2 {
    public static int fact(int num){
        if(num == 1){
            return 1;
        }
        return num * fact(num-1);
    }

    public static int findGridWays(int n, int m){
        int ans = fact((n-1) + (m-1))/(fact(n-1) * fact(m-1));

        return ans;
    }
    public static void main(String[] args){
        int n=3, m=3;
        System.out.println(findGridWays(n, m));
    }
}
