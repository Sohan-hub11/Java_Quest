//Isomorphic String.

package String;
import java.util.*;
public class Isomorphic {
    public static boolean isomorphicString(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int n = s.length();
        int sMap[] = new int[256];
        Arrays.fill(sMap,-1);
        int tMap[] = new int[256];
        Arrays.fill(tMap,-1);

        //Checking.
        for(int i=0; i<n; i++){
            if(sMap[s.charAt(i)] != tMap[t.charAt(i)]){
                return false;
            }
            sMap[s.charAt(i)] = i;
            tMap[t.charAt(i)] = i;
        }

        return  true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean ans = isomorphicString(s, t);
        if(ans) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
