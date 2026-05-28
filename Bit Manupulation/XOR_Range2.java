//XOR of Numbers in a Given Range L to R.

package BitManipulation;

public class XOR_Range2 {
    static int findXOR1(int n){
        if(n%4 == 1)
            return(1);
        else if (n%4 == 2)
            return(n+1);
        else if (n%4 == 3)
            return(0);
        else
            return(n);
    }
    static int findXOR(int L, int R){
        return findXOR1(L-1) ^ findXOR1(R);
    }
    public static void main(String[] args){
        int L = 11, R = 22;

        System.out.println(findXOR(L, R));
    }
}
