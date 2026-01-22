//Job Sequencing Problem.

package Greedy_Algorithm;
import java.util.*;
public class JobSequencing {
    public static class Jobs{
        int id;
        int deadlines;
        int profit;
        public Jobs(int i, int d, int p){
            id = i;
            deadlines = d;
            profit = p;
        }
    }
    public static void main(String[] args){
        int[][] jobInfo = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Jobs> jobs = new ArrayList<>(); //Convert job object to Arraylist.
        for(int i=0; i<jobInfo.length; i++){
            jobs.add(new Jobs(i, jobInfo[i][0], jobInfo[i][1])); //Storing data to object.
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit- obj1.profit); //Sort the object in Descending.

        ArrayList<Integer> list = new ArrayList<>();
        int time = 0;
        int totalProfit = 0;
        for(int i=0; i< jobs.size(); i++){
            Jobs curr = jobs.get(i);
            if(curr.deadlines > time){
                time++;
                totalProfit += curr.profit;
                list.add(curr.id);
            }
        }

        System.out.println("Max Job : " + list.size());
        for(int i=0; i< list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("Total profit : " + totalProfit);
    }
}
