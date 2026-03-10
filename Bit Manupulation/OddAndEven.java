//To check fo Odd & Even

package BitManipulation;

public class OddAndEven {
    public static void checkOddEven(int n){
        int maskBit = 1;
        if((n & maskBit) == 1){
            System.out.println(n + " is Odd Number");
        } else {
            System.out.println(n + " is Even Number");
        }
    }
    public static void main(String[] args){
        int n = 11;

        checkOddEven(n);
    }
}
