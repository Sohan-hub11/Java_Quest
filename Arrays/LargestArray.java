//Smallest and Largest number of an Array.

package Arrays;
import java.util.Scanner;
public class LargestArray {
    public static int largestnum(int nums[]){
        int largest = Integer.MIN_VALUE; //infinity
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] > largest ){
                largest = nums[i];
            }
            if(nums[i] < smallest){
                smallest = nums[i];
            }
        }
        System.out.println("Smallest number of the array is " + smallest);
        return largest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];

        System.out.println("Enter Number..");
        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
//      int largest = largestnum(nums);
//      System.out.println("Largest Number of the array is " + largest);
        System.out.println("Largest Number of the array is " + largestnum(nums));
    }
}
