//HashSet Implementation

package Hashing;
import java.util.*;
public class HashSetCode {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        //Below numbers will not be added as in HashSet Collection of element are unique.
        set.add(1);
        set.add(2);
        System.out.println(set);

        System.out.println("2 is Present : " + set.contains(2));
        System.out.println("11 is Present : " + set.contains(11));

        System.out.println("Size : " + set.size());

        //Remove
        set.remove(4);
        System.out.println(set);
    }
}
