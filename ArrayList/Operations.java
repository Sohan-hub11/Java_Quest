//Operations of ArrayList.

package ArrayList;
import java.util.*;
public class Operations {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        //Add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.add(1, 9);
        System.out.println(list);

        //Get
        int element = list.get(1);
        System.out.println(element);

        //Remove
        list.remove(2);
        System.out.println(list);

        //Set
        list.set(1, 10);
        System.out.println(list);

        //Contains
        System.out.println(list.contains(10));
        System.out.println(list.contains(11));
    }
}
