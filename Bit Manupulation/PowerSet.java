//Print all Subsets.

package BitManipulation;

import java.util.*;

public class PowerSet {
    public static ArrayList<ArrayList<Integer>> getSubSets(int[] nums){
        int subsets = 1 << nums.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int num=0; num<subsets; num++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                if((1 & (num >> i)) == 1){
                    list.add(nums[i]);
                }
            }

            ans.add(list);
        }

        return ans;
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 3};

        System.out.println(getSubSets(nums));
    }
}
