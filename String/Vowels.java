//to Checks number of Vowels and Consonant.

package String;

public class Vowels {
    public static void main(String[] args){
        String str = "Sohan";
        int v=0;
        int c=0;

        //Operations.
        for(int i=0; i<str.length(); i++){
            if("aeiouAEIOU".indexOf(str.charAt(i)) != -1){
                v++;
            }
            else {
                c++;
            }
        }
        System.out.println("Vowels Count : " +v);
        System.out.println("Consonant Count : " +c);
    }

}
