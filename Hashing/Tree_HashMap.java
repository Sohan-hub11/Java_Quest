//Tree Hash Map.

package Hashing;

import java.util.*;

public class Tree_HashMap {
    public static void main(String[] args){
        TreeMap<String, Integer> thm = new TreeMap<>();
        thm.put("Tea", 10);
        thm.put("Samosa", 15);
        thm.put("Pizza", 150);
        thm.put("Coffee", 15);
        thm.put("Burger", 120);
        thm.put("Biriyani", 250);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tea", 10);
        map.put("Samosa", 15);
        map.put("Pizza", 150);
        map.put("Coffee", 15);
        map.put("Burger", 120);
        map.put("Biriyani", 250);

        System.out.println("HashMap -> " + map);
        System.out.println("Tree HashMap -> " + thm);
    }
}
