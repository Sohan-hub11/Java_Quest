//XOR of Numbers in a Given Range.

package BitManipulation;

public class XOR_Range {
    public static void main(String[] args){
        int n = 11;

        /* Brute force Approach */

//        int xor = 0;
//
//        for(int i=11; i<=22; i++){
//            xor ^= i;
//        }
//        System.out.println(xor);


        /* Optimized Approach */
        if(n%4 == 1)
            System.out.println(1);
        else if (n%4 == 2)
            System.out.println(n+1);
        else if (n%4 == 3)
            System.out.println(0);
        else
            System.out.println(n);

    }
}
