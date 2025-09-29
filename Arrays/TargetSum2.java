//Program to count the number of triplets whose sum is equal to the given value x

package Arrays;
import java.util.*;
public class TargetSum2 {
    static int tripletsum(int num[], int x){
        int len = num.length;
        int ans = 0;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                for(int k=j+1; k< len; k++)
                if(num[i]+num[j]+num[k] == x){
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


        System.out.println(tripletsum(num,target));
    }
}
