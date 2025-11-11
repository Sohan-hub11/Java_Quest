//To find Longest Common Prefix.

package String;
import java.util.*;
public class LongestCommonPrefix {
    public static String longestPrefix(String[] in){
        StringBuilder sb = new StringBuilder();
        Arrays.sort(in);
        String first = in[0];
        String last = in[in.length - 1];

        for(int i=0; i<Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = {"flower", "flow", "flight"};

        System.out.println(longestPrefix(s));
    }
}
