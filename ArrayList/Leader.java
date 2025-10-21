//leader of an Array.

package ArrayList;

import java.util.ArrayList;

public class Leader {
    public static ArrayList<Integer> findLeaderArray(int[] arr){
        int n = arr.length;
        int max = arr[n-1];
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[n-1]);

        for(int i= n-2; i>=0; i--){
            if(arr[i] > max){
                max = arr[i];
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 5, 3, 1, 2};
        ArrayList<Integer> ans = findLeaderArray(arr);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
