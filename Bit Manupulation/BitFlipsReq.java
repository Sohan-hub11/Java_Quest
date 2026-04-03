//Minimum Bit flips to Convert a Number.

package BitManipulation;

public class BitFlipsReq {
    public static int countFlips(int num, int target){
        int ans = num ^ target;
        int count = 0;

        while(ans != 0){
            ans = ans & ans-1;
            count++;
        }

        return count;
    }
    public static void main(String[] args){
        System.out.println(countFlips(10, 7));
    }
}
