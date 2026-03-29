//Decimal to Binary
    //T.C -- O(log n)
    //S.C -- O(log n)
package BitManipulation;

public class Decimal2Binary {
    public static void main(String[] args){
        int n = 13;
        StringBuilder res = new StringBuilder();

        while(n != 1){
            if(n%2 == 1){
                res.append(1);
            } else {
                res.append(0);
            }
            n = n / 2;
        }
        res.append(1); //Appending extra 1
        res.reverse();
        System.out.println(res);
    }
}
