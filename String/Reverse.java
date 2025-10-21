package String;

public class Reverse {
    static String revString(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String S1 = "Sohan";
        String reverseS1 = revString(S1);
        System.out.println(reverseS1);
    }
}
