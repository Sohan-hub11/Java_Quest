//Toggle the ith Bit.

package BitManipulation;

public class ToggleBit {
    public static void main(String[] args){
        int n = 9, i = 1;
        int leftShift = 1 << i;
        int result = n ^ leftShift;

        System.out.println(result);
    }
}
