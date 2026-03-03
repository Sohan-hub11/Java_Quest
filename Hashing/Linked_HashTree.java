//Linked HashSet.

package Hashing;

import java.util.*;

public class Linked_HashTree {
    public static void main(String[] args){
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Kolkata");
        lhs.add("Bengaluru");
        lhs.add("Delhi");
        lhs.add("Pune");
        lhs.add("Hyderabad");
        System.out.println("Linked HashSet -> " + lhs);

        HashSet<String> cities = new HashSet<>();
        cities.add("Kolkata");
        cities.add("Bengaluru");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Hyderabad");

        System.out.println("HashSet -> " + cities);

    }
}
