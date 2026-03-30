//Check if the number is a Power of 2

package BitManipulation;

public class CheckPowerOf2 {
    public static void main(String[] args){
        int n = 40;
        int result = n & n-1;
        boolean isCheck = result == 0 ? true : false;

        System.out.println("Power of 2 -- " + isCheck);
    }
}
