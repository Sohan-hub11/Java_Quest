//Divide 2 Integer without using Multiplication and Division Operators.

package BitManipulation;

public class DivideTwoInteger {
    static int findQuotient(int n, int d){
        if(n == d)
            return 1;
        boolean sign = true;
        if(n >= 0 && d < 0)
            sign = false;
        if(n < 0 && d >= 0)
            sign = false;

        n = Math.abs(n);
        d = Math.abs(d);

        int ans = 0;
        while(n >= d){
            int count = 0;
            while(n >= (d << (count+1))){
                count++;
            }

            ans += 1 << count;
            n = n - (d << count);
        }

        if(ans == Integer.MAX_VALUE && sign)
            return Integer.MAX_VALUE;
        if(ans == Integer.MIN_VALUE && !sign)
            return Integer.MIN_VALUE;

        return sign ? ans : -1 * ans;
    }
    public static void main(String[] args){
        int dividend = 22, divisor = 3;

        System.out.println(findQuotient(dividend, divisor));
    }
}
