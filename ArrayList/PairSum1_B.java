//Pair Sum - 1 (Two-Pointer Approach)

package ArrayList;

import java.util.ArrayList;

public class PairSum1_B {
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        int lp = 0, rp = list.size()-1;

        while (lp < rp){
            if((list.get(lp) + list.get(rp)) == target){
                return true;
            }else if((list.get(lp) + list.get(rp)) < target){
                lp++;
            } else {
                rp--;
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
        int target = 5;

        System.out.println(pairSum1(list, target));
    }
}
