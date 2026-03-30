//Count No of Set Bits.
//Optimized way-- O(no of set bits).

package BitManipulation;

public class CountSetBits2 {
    public static void main(String[] args){
        int n = 84;
        int count = 0;

        //No of times below operation took place -- results in no of set Bits.
        while(n != 0){
            n = n & n-1;
            count++;
        }

        System.out.println(count);
    }
}
