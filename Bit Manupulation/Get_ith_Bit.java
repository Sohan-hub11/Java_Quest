//Get ith Bit.

package BitManipulation;

public class Get_ith_Bit {
    public static void check_ithBit(int n, int i){
        int maskBit = (1 << i);

        if((n & maskBit) == 0){
            System.out.println("0 is present");
        } else {
            System.out.println("1 is present");
        }
    }
    public static void main(String[] args){
        int n = 15;

        check_ithBit(n, 2);
    }
}
