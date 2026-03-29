//Swap 2 Numbers without using 3rd Variable
    //Also don't use Addition & Subtraction operation
//Using XOR Operation

package BitManipulation;

public class Swap2No {
    public static void main (String[] args){
        int a = 4;
        int b = 5;
        System.out.println("Before Swapping --");
        System.out.println("a : " + a + " " + "b : " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping --");
        System.out.println("a : " + a + " " + "b : " + b);
    }
}
