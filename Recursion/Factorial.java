//To find Factorial

package Recursion;

public class Factorial {
    public static int fact(int n){
        int f = 1;
        if(n == 0){
            return 1;
        }
        f = n * fact(n-1);
        return f;
    }
    public static void main(String[] args){
        int num = 5;
        System.out.println(fact(num));
    }
}
