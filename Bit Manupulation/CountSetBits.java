//Count No of Set Bits.

package BitManipulation;

public class CountSetBits {
    public static void main(String[] args){
        int n = 40;
        int count = 0;
        while(n/2 != 1){
            count += n & 1; //Replacement of % for Remainder
            n = n >> 1; //Replacement of / for Remainder
        }

        System.out.println(count+1);
    }
}
