//Single Number-III
//find the 2 numbers in the array which is not repeating.

package BitManipulation;

import java.util.*;

public class SingleNum3 {
    public static void main(String[] args){
        int[] arr = {2, 4, 2, 14, 3, 7, 7, 3};

        //Step - 1
        long xor = 0;
        for(int num: arr){
            xor ^= num;
        }

        //Step - 2
        long rightMost = (xor & xor-1)^xor;

        //Step - 3
        int b1=0, b2=0;
        for(int num: arr){
            if((num & rightMost) != 0)
                b1 ^= num;
            else
                b2 ^= num;
        }

        System.out.println(b1 +" "+ b2);
    }
}
