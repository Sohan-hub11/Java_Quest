//Prefix Sum.

package Arrays;

public class PrefixSum {
    public static void prefixsum(int num[]){
        int currsum =0;
        int max = Integer.MIN_VALUE; //Infinity

        //creating a prefix array.
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        for(int i=1; i<num.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        //Accessing SubArrays.
        for(int i=0 ;i<num.length; i++){

            for(int j=i; j<num.length; j++){
                currsum = i == 0 ?prefix[j] :prefix[j] - prefix[i-1];
                if(max < currsum){
                    max = currsum;
                }
            }

        }
        System.out.println("Max Sum of the Sub Array : " +max);
    }
    public static void main(String[] args){
        int num[] = {1, -2, 6, -1, 3};
        prefixsum(num);
    }
}
