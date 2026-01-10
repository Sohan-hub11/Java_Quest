//To Check it's a Valid Parenthesis or not.

package Stack;
import java.util.*;
public class ValidParenthesis {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length()-1; i++){
            char ch = str.charAt(i);

            //Opening
            if(ch == '(' || ch=='{' || ch=='['){
                s.push(ch);
            }

            //Closing
            else {
                if(s.isEmpty()){
                    return false;
                }
                if (s.peek() == '(' && ch == ')' ||
                        s.peek() == '{' && ch == '}' ||
                        s.peek() == '[' && ch == ']') {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[]args){
        String str = "()";
        System.out.println(isValid(str));;
    }
}
