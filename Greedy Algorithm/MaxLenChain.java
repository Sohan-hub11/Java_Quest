//Max Length Chain of Pairs.

package Greedy_Algorithm;
import java.util.*;
public class MaxLenChain {
    public static void main(String[] args){
        int[][] pairs = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        
    }
}
