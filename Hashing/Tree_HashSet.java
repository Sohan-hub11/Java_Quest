//Tree HashSet.

package Hashing;

import java.util.*;

public class Tree_HashSet {
    public static void main(String[] args){
        TreeSet<String> ths = new TreeSet<>();
        ths.add("Kolkata");
        ths.add("Bengaluru");
        ths.add("Delhi");
        ths.add("Pune");
        ths.add("Hyderabad");
        System.out.println("Tree HashSet -> " + ths);

        HashSet<String> cities = new HashSet<>();
        cities.add("Kolkata");
        cities.add("Bengaluru");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Hyderabad");

        System.out.println("HashSet -> " + cities);

    }
}
