//To check 2 string s, t is a Valid Anagram or not.

package Hashing;
import java.util.*;
public class Anagram {
    public static boolean checkAnagram(String s, String t){
        //Step 1
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        //Step 2
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch) == 1){
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }

        //Step 3
        return map.isEmpty();
    }
    public static void main(String[] args){
        String s = "race";
        String t = "care";

        //String s = "tulip";
        //String t = "lipid";

        System.out.println(checkAnagram(s, t));
    }
}
