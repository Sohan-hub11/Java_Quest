//Pair Sum - 2 (Two-Pointer Approach)

package ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        //Find pivot point
        int lp = 0, rp = 0;
        int n = list.size();
        for(int i=0; i<n-1; i++){
            if(list.get(i) > list.get(i+1)){
                rp = i;
                lp = i+1;
            }
        }

        while(lp != rp){
            if((list.get(lp) + list.get(rp)) == target){
                return true;
            }else if((list.get(lp) + list.get(rp)) < target){
                lp = (lp + 1)%n;
            } else {
                rp = (n + rp - 1)%n;
            }
        }

        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;

        System.out.println(pairSum1(list, target));
    }
}
