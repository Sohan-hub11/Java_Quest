//Decimal to Binary
//T.C -- O(length)
//S.C -- O(1)
package BitManipulation;

public class Binary2Decimal {
    public static void main(String[] args){
        String n = "0110";
        int num = 0;
        int p2 = 1;
        for(int i=n.length()-1; i>=0; i--){
            if(n.charAt(i) == '1'){
                num += p2;
            }
            p2 *= 2;
        }

        System.out.println(num);
    }
}
