//Program to find the total number of pairs in the arrays whose sum is equal to the given value x

package Arrays;
import java.util.*;
public class TargetSum {
    static int pairsum(int num[], int x){
        int ans = 0;
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i]+num[j] == x){
                    ans++;
                }
            }
        }
        return ans;
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

        System.out.print("Enter Target Sum : ");
        int target = sc.nextInt();


        System.out.println(pairsum(num,target));
    }
}
