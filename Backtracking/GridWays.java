//Grid Ways Problem.

package Backtracking;

public class GridWays {
    public static int findGridWays(int x, int y, int n, int m){
        //Base Case
        if(x == n-1 && y == m-1){ //Target point
            return 1;
        } else if (x == n || y == m) {
            return 0;
        }

        int w1 = findGridWays(x, y+1, n, m);
        int w2 = findGridWays(x+1, y, n, m);

        return w1+w2;
    }
    public static void main(String[] args){
        int n=3, m=3;
        System.out.println(findGridWays(0,0, n, m));
    }
}
