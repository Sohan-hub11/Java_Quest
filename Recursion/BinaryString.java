//Print all binary string of size N without consecutive ones --

package Recursion;

public class BinaryString {
    public static void binaryString(int n, int lastplace, String str){
        //Base Case.
        if(n == 0){
            System.out.println(str);
            return;
        }

        //Workings
        binaryString(n-1, 0, str.concat("0"));
        if(lastplace == 0){
            binaryString(n-1, 1, str.concat("1"));
        }
    }
    public static void main(String[] args){

        binaryString(3, 0, "");
    }
}
