//Usage of String Builder.

package String;

public class String_Builder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
            /*
            Time Complexity: (for String Builder)- O(n^2).
                             (for Normal String) - O(26 * n^2). becoz everytime the string get
                                                   copied and modified accordingly.
             */
        }
        System.out.println(sb);
    }
}
