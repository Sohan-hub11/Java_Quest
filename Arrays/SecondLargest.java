//Program to find the second-largest element in the given array

package Arrays;
import java.util.*;
public class SecondLargest {
    static int findmax(int num[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return max;
    }
    static int secondmax(int num[]){
        int max = findmax(num);
        for(int i = 0; i < num.length; i++){
            if(num[i] == max){
                num[i] = Integer.MIN_VALUE;
            }
        }
        int secondlargest = findmax(num);
        return secondlargest;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();

        int num[] = new int[n];
        System.out.println("Enter " + n + " elements...");
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        System.out.println(secondmax(num));
    }
}
