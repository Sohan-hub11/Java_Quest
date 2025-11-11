//Monkeys, Banana, Peanut.

package MixedQuestions;
import java.util.*;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Total no of monkeys.
        int m = sc.nextInt(); //Total banana.
        int p = sc.nextInt(); //Total peanuts.
        int k = sc.nextInt(); //no of banana a monkey can eat at a time.
        int j = sc.nextInt(); //no of peanuts a monkey can eat at a time.
        int remain_mon;

        //task.
        int mon_banana = m / k;
        int remain_banana = m % k;

        int mon_peanut = p / j;
        int remain_peanut = p % j;

        remain_mon = n - (mon_banana + mon_peanut); //Finding remaining monkeys.
        if(remain_banana > 0 || remain_peanut > 0) {
            remain_mon--;
        }

        System.out.println(remain_mon);
    }
}
