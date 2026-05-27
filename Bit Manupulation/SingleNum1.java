//Single Number-I
//find the number in the array which is not repeating.

package BitManipulation;

public class SingleNum1 {
    public static void main(String[] args){
        int[] arr = {1, 2, 7, 7, 5, 1, 2};

        int xor = 0;
        for(int num: arr){
            xor ^= num;
        }

        System.out.println(xor);
    }
}
