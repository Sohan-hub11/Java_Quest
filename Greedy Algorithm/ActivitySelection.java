//Activity Selection.

package Greedy_Algorithm;

import java.util.*;

public class ActivitySelection {
    public static void main(String[] args){
        int[] start = {0, 1, 3, 5, 5, 8};
        int[] end = {6, 2, 4, 7, 9, 9};

        //if end[] not sorted.
        int[][] activities = new int[start.length][3];
        for(int i=0; i< start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //Lambda Function --> short form.
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        //Main Solution.
        int maxAct = 0;
        ArrayList<Integer> list = new ArrayList<>(); //for storing index.

        //1st Activity.
        list.add(activities[0][0]);
        maxAct = 1;

        int endAct = activities[0][2];
        for(int i=1; i<end.length; i++){
            if(activities[i][1] >= endAct){
                maxAct++;
                endAct = activities[i][2];
                list.add(activities[i][0]);
            }
        }

        System.out.println("Max Activity " + maxAct);
        for(int i=0; i<list.size(); i++) {
            System.out.print("A" + list.get(i) + " ");
        }

    }
}
