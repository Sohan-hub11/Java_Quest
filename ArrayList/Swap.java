//Swapping elements in ArrayList.

package ArrayList;
import java.util.*;
public class Swap {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(11);
        list.add(4);
        list.add(6);
        System.out.println(list);

        swap(list, 1, 4);
        System.out.println(list);
    }
}
