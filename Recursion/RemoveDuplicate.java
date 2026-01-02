//To Remove Duplicate in a String --

package Recursion;

public class RemoveDuplicate {
    public static void removeDuplicates(String str, StringBuilder newStr, int idx, boolean[] map){
        //Base Case.
        if(idx == str.length()-1){
            System.out.println(newStr);
            return;
        }

        //Working
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDuplicates(str, newStr, idx+1, map);
        }
        else {
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            removeDuplicates(str, newStr, idx+1, map);
        }
    }
    public static void main(String[] args){
        StringBuilder newStr = new StringBuilder();
        String str = "sohansamanta";
        removeDuplicates(str, newStr, 0, new boolean[26]);
    }
}
