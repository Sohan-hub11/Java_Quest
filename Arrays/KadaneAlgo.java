//Kadane's Algorithm.

package Arrays;

public class KadaneAlgo {
    public static void kadane(int num[]){
        int maxsum = Integer.MIN_VALUE; //Infinity
        int currsum = 0;

        //Operations
        for(int i=0; i< num.length; i++){
            currsum += num[i];
            if( currsum < 0){
                currsum = 0;
            }
            //if(maxsum < currsum){
            maxsum = Math.max(currsum, maxsum);
            //}
        }
        System.out.println("Max Sum : " +maxsum);
    }
    public static void main(String[] args){
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(num);
    }
}
