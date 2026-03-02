//HashMap Operators

package Hashing;
import java.util.*;
public class HashMapOperator {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        //Add
        map.put("Tea", 10);
        map.put("Samosa", 15);
        map.put("Pizza", 250);
        map.put("Coffee", 15);
        System.out.println(map);

        //Get
        System.out.println(map.get("Tea"));

        //Contains
        System.out.println(map.containsKey("Pizza"));
        System.out.println(map.containsKey("Biriyani"));

        //Removes
//        map.remove("Coffee");
//        System.out.println(map);

        //Check Size
        System.out.println(map.size());

        //isEmpty
        System.out.println(map.isEmpty());
        
    }
}
