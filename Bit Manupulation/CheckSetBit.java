//Check ith bit is set or not

package BitManipulation;

public class CheckSetBit {
    public static void main(String[] args){
        int n = 13;
        int i = 2;

        int rightShiftVal = n >> i;
        if((rightShiftVal & 1) == 0){
            System.out.println("It is not a Set Bit");
        } else {
            System.out.println("It is a Set Bit");
        }
    }
}
