//Fractional Knapsack Problem.

package Greedy_Algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args){
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int weight = 50;

        double[][] ratio = new double[val.length][2];
        for(int i=0; i< val.length; i++){
            //col[0] -> index, col[1] -> ratio.
            ratio[i][0] = i;
            ratio[i][1] =  val[i]/ (double) wt[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        double value = 0;
        int capacity = weight;
        for(int i= val.length-1; i>=0; i--){
            int idx = (int) ratio[i][0];
            if(capacity >= wt[idx]){
                capacity = capacity - wt[idx];
                value = value + val[idx];
            } else {
                value = value + (capacity * ratio[i][1]);
                break;
            }
        }

        System.out.println("Maximum Value : " + value);
    }
}
