//Clear the ith Bit

package BitManipulation;

public class Clear_ith_Bit {
    public static void main(String[] args){
        int n = 13, i = 2;
        int leftShift = 1 << i;
        int result = n & ~leftShift;

        System.out.println(result);
    }
}
