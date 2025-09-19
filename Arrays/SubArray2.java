//Max and Min of Sub Arrays

package Arrays;

public class SubArray2 {
    public static void sumsubarray(int num[]){
        int sum = 0;
        int max = Integer.MIN_VALUE; //Infinity
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< num.length; i++){
            for(int j = i; j< num.length; j++){
                for(int k = i; k<= j; k++){
                    sum += num[k];
                    System.out.print(num[k] + " "); //Sub Array
                }
                System.out.print("\nSum : " +sum);
                if(max < sum){
                    max = sum;
                }
                if(min > sum){
                    min = sum;
                }
                sum = 0;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Sum of Largest Sub Array... " +max +"," +"  Sum of Smallest Sub Array... " +min);
    }
    public static void main(String[] args){
        int num[] = {2,4,8,11,18};
        sumsubarray(num);
    }
}
