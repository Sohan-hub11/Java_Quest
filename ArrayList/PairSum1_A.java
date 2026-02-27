//Pair Sum - 1 (Brute Force)

package ArrayList;
import java.util.*;
public class PairSum1_A {
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        for(int i=0; i< list.size()-1; i++){
            for(int j=i+1; j< list.size(); j++){
                int currSum = list.get(i) + list.get(j);
                if(currSum == target){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 11;

        System.out.println(pairSum1(list, target));
    }
}
