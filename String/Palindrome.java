//To check Palindrome...

package String;
import java.util.*;
public class Palindrome {
    static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                System.out.println("Not a Palindrome...");
                return false;
            }
        }
        System.out.println("It is a Palindrome");
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }
}
