//Program to find a unique number in a given array

package Arrays;
import java.util.*;
public class UniqueElement {
    static void unique(int num[]){
        int len = num.length;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(num[i] == num[j]){
                    num[i] = -1;
                    num[j] = -1;
                }
            }
        }

        for(int i=0; i<len; i++){
            if(num[i] > 0){
                System.out.println(num[i] + " at index " + i);
            }
        }
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

        unique(num);
    }
}