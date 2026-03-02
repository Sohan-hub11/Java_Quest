//Linked Hash Map.

package Hashing;

import java.util.*;

public class Linked_HashMap {
    public static void main(String[] args){
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Tea", 10);
        lhm.put("Samosa", 15);
        lhm.put("Pizza", 150);
        lhm.put("Coffee", 15);
        lhm.put("Burger", 120);
        lhm.put("Biriyani", 250);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tea", 10);
        map.put("Samosa", 15);
        map.put("Pizza", 150);
        map.put("Coffee", 15);
        map.put("Burger", 120);
        map.put("Biriyani", 250);

        System.out.println("HashMap -> " + map);
        System.out.println("Linked HashMap -> " + lhm);
    }
}
