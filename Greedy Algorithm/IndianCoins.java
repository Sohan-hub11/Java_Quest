//Indian Coins Problem.

package Greedy_Algorithm;
import java.util.*;
public class IndianCoins {
    public static void main(String[] args){
        Integer[] coins = {2, 1, 5, 10, 50, 20, 100, 500, 2000};
        int amount = 590;
        Arrays.sort(coins, Comparator.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;
        for(int i=0; i<coins.length; i++){
            if(amount >= coins[i]){
                while (amount >= coins[i]){
                    count++;
                    amount -= coins[i];
                    list.add(coins[i]);
                }
            }
        }

        System.out.println("Coins count : " + count);
        for(int i=0; i< list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
