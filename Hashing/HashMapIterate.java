//Iteration on HashMap.

package Hashing;
import java.util.*;
public class HashMapIterate {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tea", 10);
        map.put("Samosa", 15);
        map.put("Pizza", 150);
        map.put("Coffee", 15);
        map.put("Burger", 120);
        map.put("Biriyani", 250);

        Set<String> keys = map.keySet();
        System.out.println(keys);

        //Iterate
        for(String k : keys){
            System.out.println("key: " + k + " & Value: " + map.get(k));
        }
    }
}
