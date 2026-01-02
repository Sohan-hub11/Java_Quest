//Friends Pairing Problem --

package Recursion;

public class FriendsPairing {
    public static int friendsPairingCal(int n){
        //Base Case.
        if(n==1 || n==2){
            return n;
        }

        //Workings.
        //Single -
        int fn1 = friendsPairingCal(n-1);
        //Pair -
        int fn2 = friendsPairingCal(n-2) * n-1;

        return fn1 + fn2;
    }
    public static void main(String[] args){
        System.out.println(friendsPairingCal(3));
    }
}
