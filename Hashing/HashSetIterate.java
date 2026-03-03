//Iterate in HashSet.

package Hashing;
import java.util.*;
public class HashSetIterate {
    public static void main(String[] args){
        HashSet<String> cities = new HashSet<>();

        cities.add("Kolkata");
        cities.add("Bengaluru");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Hyderabad");

        //using Iterators
        Iterator<String> itr = cities.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("***************");

        //using for loop enhanced
        for(String city : cities){
            System.out.println(city);
        }
    }
}
