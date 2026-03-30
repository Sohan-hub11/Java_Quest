//Remove Last Set Bit.

package BitManipulation;

public class RemoveLastSetBit {
    public static void main(String[] args){
        int n = 40;
        int result = n & n-1;

        System.out.println(result);
    }
}
