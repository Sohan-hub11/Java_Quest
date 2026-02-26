//Sorting an ArrayList.

package ArrayList;
import java.util.*;
public class Sorting {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(11);
        list.add(4);
        list.add(6);
        System.out.println(list);

        //Ascending Order.
        Collections.sort(list);
        System.out.println(list);

        //Descending Order.
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
