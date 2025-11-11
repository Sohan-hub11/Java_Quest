//String Encryption -- (Caesar Cipher)

package String;
import java.util.*;
public class Encryption {
    public static String encrypted(int key, String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                ch = (char) (((ch - '0' + key) % 10) + '0');
                sb.append(ch);
            }

            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                ch = (char) (((ch - 'a' + key) % 26) + 'a');
                sb.append(ch);
            }

            if(ch == ' '){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int key = sc.nextInt();

        System.out.println(encrypted(key, s));
    }
}
