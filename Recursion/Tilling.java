//Tilling Problem.

package Recursion;

public class Tilling {
    public static int tilling(int n){
        //Base case.
        if(n == 0 || n == 1){
            return 1;
        }

        //Workings.
        //Vertical Choice-
        int fnm1 = tilling(n-1);

        //Horizontal Choice.
        int fnm2 = tilling(n-2);

        int totalWay = fnm1 + fnm2;
        return totalWay;
    }
    public static void main(String[] args){
        System.out.println(tilling(3));
    }
}
