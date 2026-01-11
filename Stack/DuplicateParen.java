//To Check it's a Duplicate Parenthesis or not.

package Stack;

import java.util.Stack;

public class DuplicateParen {
    public static boolean check(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length()-1; i++) {
            char ch = str.charAt(i);
            //closing
            if (ch == ')'){
                int count = 0;
                while (s.pop() == '('){
                    count++;
                }
                if(count < 1){
                    return true;
                }
            }

            //opening
            else {
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args){
        String str = "(a+b)";
        System.out.println(check(str));
    }
}
