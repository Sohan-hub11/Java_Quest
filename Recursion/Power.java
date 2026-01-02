//Print x to the power n --
//Time Complexity -- O(n)

package Recursion;

public class Power {
    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }
        int powXn = x * pow(x, n-1);
        return powXn;
    }
    public static void main(String[] args){
        System.out.println(pow(2, 4));
    }
}
