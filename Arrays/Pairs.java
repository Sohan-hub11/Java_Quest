//Prints Pair of an Array.

package Arrays;

public class Pairs {
    public static void printpairs(int num[]){
        int tp =0;
        for(int i = 0; i < num.length; i++){ //1st Loop to identify the 1st element of the pairs.
            for(int j = i+1; j< num.length; j++){ //2nd loop to identify the 2nd element.
                System.out.print("(" +num[i] + "," + num[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs..."+tp);
    }

    public static void main(String[] args){
        int num[] = {2,4,8,11,18};
        printpairs(num);
    }
}
